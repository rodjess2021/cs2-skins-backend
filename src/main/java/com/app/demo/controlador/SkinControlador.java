package com.app.demo.controlador;

import com.app.demo.modelo.Skin;
import com.app.demo.servicio.SkinServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
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


    //Para insertar UN skin
    @PostMapping
    private ResponseEntity<Skin> saveSkin(@RequestBody Skin skin) {
        try {
            Skin skinGuardada = skinServicio.save(skin);
            return ResponseEntity.created(new URI("/skin/"+skinGuardada.getId())).body(skinGuardada);
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


    //Para insertar VARIOS skin
    @PostMapping("/bulk")
    private ResponseEntity<List<Skin>> saveAllSkins(@RequestBody List<Skin> skins) {
        try {
            List<Skin> skinsGuardadas = skinServicio.saveAll(skins);
            return ResponseEntity.status(HttpStatus.CREATED).body(skinsGuardadas);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

}
