package com.example.Jardineria.ModuloA.Repository;

import com.example.Jardineria.ModuloA.Entity.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CiudadRepository extends JpaRepository<Ciudad, String> {
}
