package com.example.Jardineria.ModuloA.Repository;

import com.example.Jardineria.ModuloA.Entity.TrazabilidadPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrazabilidadPagoRepository extends JpaRepository<TrazabilidadPedido, String> {
}
