package com.app.demo.controlador;

import com.app.demo.modelo.Categoria;
import com.app.demo.servicio.CategoriaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/categoria/")
public class CategoriaControlador {

    @Autowired
    private CategoriaServicio categoriaServicio;

    @GetMapping
    private ResponseEntity<List<Categoria>> getAllCategorias(){
        return ResponseEntity.ok(categoriaServicio.findAll());
    }

    @PostMapping
    private ResponseEntity<Categoria> saveCategoria(@RequestBody Categoria categoria) {
        try {
            Categoria categoriaGuardada = categoriaServicio.save(categoria);
            return ResponseEntity.created(new URI("/arma/"+categoriaGuardada.getId())).body(categoriaGuardada);
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
