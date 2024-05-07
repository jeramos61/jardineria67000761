package com.example.Jardineria.ModuloA.Repository;

import com.example.Jardineria.ModuloA.Entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, String> {
}
