package com.example.Jardineria.ModuloA.Repository;

import com.example.Jardineria.ModuloA.Entity.Producto;
import com.example.Jardineria.ModuloA.Entity.Proveedores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProveedoresRepository extends JpaRepository<Proveedores, String> {
    List<Proveedores> findByNombreProveedor(String nombre);

    @Query(value = "SELECT MAX(p.codigoProveedor) FROM Proveedores p")
    String obtenerUltimoCodigoProveedor();
}
