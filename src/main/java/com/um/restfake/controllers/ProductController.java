package com.um.restfake.controllers;

import com.um.restfake.entities.Producto;
import com.um.restfake.services.ProductServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "restfake.com/productos")
public class ProductController extends BaseControllerImpl<Producto, ProductServiceImpl> {

    @GetMapping("/precio")
    public ResponseEntity<?> getProductsByPriceRange(@RequestParam Double precioMinimo, @RequestParam Double precioMaximo) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.buscarPorPrecioEntre(precioMinimo, precioMaximo));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @GetMapping("/precio/menor")
    public ResponseEntity<?> getProductsByPriceLessThan(@RequestParam Double precioMinimo) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.buscarPorPrecioMinimo(precioMinimo));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }
}