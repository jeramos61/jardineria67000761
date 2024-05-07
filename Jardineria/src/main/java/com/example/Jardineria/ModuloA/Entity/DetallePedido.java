package com.example.Jardineria.ModuloA.Entity;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity

public class DetallePedido {

    @Id

    private String codigoPedido;
    private Integer cantidad;
    private Integer precionUnidad;
    private Integer numeroLinea;
    private String idTransaccion;
    private String Codigoestado;
}
