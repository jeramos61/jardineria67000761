package com.example.Jardineria.ModuloA.Repository;

import com.example.Jardineria.ModuloA.Entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
