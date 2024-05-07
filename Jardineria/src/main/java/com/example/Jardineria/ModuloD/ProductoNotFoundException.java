package com.example.Jardineria.ModuloD;

public class ProductoNotFoundException extends RuntimeException {

    public ProductoNotFoundException(String message) {
        super(message);
    }
}