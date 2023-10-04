package com.um.restfake.services;

import com.um.restfake.entities.Base;

import java.io.Serializable;
import java.util.List;

// public interface BaseService <E> {
public interface BaseService<E extends Base, ID extends Serializable> {

    List<E> findALL() throws Exception;

    E findById(ID id) throws Exception;

    E save(E entity) throws Exception;

    E update(ID id, E entity) throws Exception;

    boolean delete(ID id) throws Exception;

}