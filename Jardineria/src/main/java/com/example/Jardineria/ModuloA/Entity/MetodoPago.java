package com.example.Jardineria.ModuloA.Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
@Data
@Entity
public class MetodoPago {
    @Id

    private String codigoMetodoPago;
    private String nombreMetodoPago;
}
