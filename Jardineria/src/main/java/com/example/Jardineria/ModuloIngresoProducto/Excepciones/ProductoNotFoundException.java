package com.example.Jardineria.ModuloIngresoProducto.Excepciones;

public class ProductoNotFoundException extends RuntimeException {

    public ProductoNotFoundException(String message) {
        super(message);
    }
}