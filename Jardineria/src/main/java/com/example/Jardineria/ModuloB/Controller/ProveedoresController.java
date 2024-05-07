package com.example.Jardineria.ModuloB.Controller;


import com.example.Jardineria.ModuloA.Entity.GamaProducto;
import com.example.Jardineria.ModuloA.Entity.Proveedores;
import com.example.Jardineria.ModuloB.Service.GamaProductoService;
import com.example.Jardineria.ModuloB.Service.ProveedoresService;
import com.example.Jardineria.ModuloC.GamaProductoDTO;
import com.example.Jardineria.ModuloC.ProveedoresDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Proveedores")
public class ProveedoresController {
    @Autowired
    private ProveedoresService proveedoresService;

    @GetMapping
    public List<Proveedores> findAll(){
        return proveedoresService.getProveedores();
    }


    @GetMapping("/{Proveedor}")
    public Optional<Proveedores> getById(@PathVariable("Proveedor")String proveedor){
        return proveedoresService.getProveedor(proveedor);
    }

    @PostMapping("/Crear")
    public void save(@RequestBody ProveedoresDTO proveedoresDTO){
        proveedoresService.save(proveedoresDTO);
    }
    @PutMapping("/Actualizar")
    public void update(@RequestBody ProveedoresDTO proveedoresDTO){

    }

    @DeleteMapping("/{gama}")
    public void delete(@PathVariable("gama") String gama){
        proveedoresService.delete(gama);
    }

}
