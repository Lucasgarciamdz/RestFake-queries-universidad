package com.um.restfake.services;


import com.um.restfake.entities.Producto;

import java.util.List;


public interface ProductoService extends BaseService<Producto, Long> {
    List<Producto> buscarPorPrecioMinimo(Double precioMinimo) throws Exception;

    List<Producto> buscarPorPrecioMinimoNativo(Double precioMinimo) throws Exception;

    List<Producto> buscarPorPrecioEntre(Double precioMinimo, Double precioMaximo) throws Exception;

    List<Producto> buscarPorPrecioEntreNativo(Double precioMinimo, Double precioMaximo) throws Exception;

}


