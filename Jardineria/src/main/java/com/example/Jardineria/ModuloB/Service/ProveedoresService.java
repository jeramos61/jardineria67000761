package com.example.Jardineria.ModuloB.Service;

import com.example.Jardineria.ModuloA.Entity.Proveedores;

import com.example.Jardineria.ModuloA.Repository.ProveedoresRepository;

import com.example.Jardineria.ModuloC.ProveedoresDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProveedoresService {

    @Autowired
    ProveedoresRepository proveedoresRepository;

    public List<Proveedores> getProveedores(){
        return  proveedoresRepository.findAll();
    }

    public Optional<Proveedores> getProveedor(String codigoProveedor){
        return proveedoresRepository.findById(codigoProveedor);
    }

    public void save(ProveedoresDTO proveedoresDTO){
        Proveedores proveedores = new Proveedores();

        proveedoresRepository.save(proveedores);
    }


    public void delete(String codigoProveedor){
        proveedoresRepository.deleteById(codigoProveedor);
    }

}

