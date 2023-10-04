package com.um.restfake.services;


import com.um.restfake.entities.Producto;
import com.um.restfake.repositories.BaseRepository;
import com.um.restfake.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl  extends BaseServiceImpl<Producto, Long> implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public ProductServiceImpl(BaseRepository<Producto, Long> baseRepository, ProductoRepository productoRepository) {
        super(baseRepository);
        this.productoRepository = productoRepository;
    }

    @Override
    public List<Producto> buscarPorPrecioMinimo(Double precioMinimo) throws Exception {
        try {
            List<Producto> productos = productoRepository.buscarPorPrecioMinimo(precioMinimo);
            return productos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Producto> buscarPorPrecioMinimoNativo(Double precioMinimo) throws Exception {
        try {
            List<Producto> productos = productoRepository.buscarPorPrecioMinimoNativo(precioMinimo);
            return productos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Producto> buscarPorPrecioEntre(Double precioMinimo, Double precioMaximo) throws Exception {
        try {
            List<Producto> productos = productoRepository.buscarPorPrecioEntre(precioMinimo, precioMaximo);
            return productos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Producto> buscarPorPrecioEntreNativo(Double precioMinimo, Double precioMaximo) throws Exception {
        try {
            List<Producto> productos = productoRepository.buscarPorPrecioEntreNativo(precioMinimo, precioMaximo);
            return productos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
