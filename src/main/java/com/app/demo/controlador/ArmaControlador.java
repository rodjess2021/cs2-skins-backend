package com.app.demo.controlador;

import com.app.demo.modelo.Arma;
import com.app.demo.servicio.ArmaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/arma/")
@CrossOrigin(origins = {"http://localhost:4200/",
                        "https://cs2-skins-blond.vercel.app"})
public class ArmaControlador {

    @Autowired
    private ArmaServicio armaServicio;

    @GetMapping
    private ResponseEntity<List<Arma>> getAllArmas(){
        return ResponseEntity.ok(armaServicio.findAll());
    }

    @PostMapping
    private ResponseEntity<Arma> saveArma(@RequestBody Arma arma){
        try {
            Arma armaGuardada = armaServicio.save(arma);
            return ResponseEntity.created(new URI("/arma/"+armaGuardada.getId())).body(armaGuardada);
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteArma(@PathVariable Long id) {

        armaServicio.deleteById(id);

        return ResponseEntity.ok("Arma eliminada correctamente");
    }
}
