package com.app.demo.controlador;

import com.app.demo.modelo.Skin;
import com.app.demo.servicio.SkinServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/skin/")
public class SkinControlador {

    @Autowired
    private SkinServicio skinServicio;


    @GetMapping
    private ResponseEntity<List<Skin>> getAllSkins(){
        return ResponseEntity.ok(skinServicio.findAll());
    }

}
