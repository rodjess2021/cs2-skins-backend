package com.app.demo.controlador;

import com.app.demo.modelo.Categoria;
import com.app.demo.servicio.CategoriaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
