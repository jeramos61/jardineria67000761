package com.example.Jardineria.ModuloA.Repository;

import com.example.Jardineria.ModuloA.Entity.MetodoPago;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.reflect.Member;

public interface MetodoPagoRepository extends JpaRepository<MetodoPago, String> {
}
