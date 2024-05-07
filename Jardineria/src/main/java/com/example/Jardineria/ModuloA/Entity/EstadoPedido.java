package com.example.Jardineria.ModuloA.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class EstadoPedido {
    @Id
    private Integer idEstadoPedido;
    private String nombre;

    @ManyToOne
    @JoinColumn(name="codigo_pedido")
    @JsonIgnoreProperties("estadoPedido")
    private Pedido pedido;

}