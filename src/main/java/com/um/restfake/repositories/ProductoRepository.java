package com.um.restfake.repositories;

import com.um.restfake.entities.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends BaseRepository<Producto, Long> {

    @Query("SELECT p FROM Producto p WHERE p.price > :precioMinimo")
    List<Producto> buscarPorPrecioMinimo(@Param("precioMinimo") Double precioMinimo);

    @Query(
            value = "SELECT * FROM Producto WHERE Producto.price > :precioMinimo",
            nativeQuery = true
    )
    List<Producto> buscarPorPrecioMinimoNativo(@Param("precioMinimo") Double precioMinimo);

    @Query("SELECT p FROM Producto p WHERE p.price > :precioMinimo AND p.price < :precioMaximo")
    List<Producto> buscarPorPrecioEntre(@Param("precioMinimo") Double precioMinimo, @Param("precioMaximo") Double precioMaximo);

    @Query(
            value = "SELECT * FROM Producto WHERE Producto.price > :precioMinimo AND Producto.price < :precioMaximo",
            nativeQuery = true
    )
    List<Producto> buscarPorPrecioEntreNativo(@Param("precioMinimo") Double precioMinimo, @Param("precioMaximo") Double precioMaximo);

}
