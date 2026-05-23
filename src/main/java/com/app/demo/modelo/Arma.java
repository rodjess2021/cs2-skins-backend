package com.app.demo.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Arma")
public class Arma {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank
    private String nombre;

    @NotNull
    private boolean statTrak;

    @NotBlank
    @Column(name = "imagen_url", columnDefinition = "TEXT")
    private String imagenUrl;

    @ManyToOne
    @JoinColumn (name = "id_categoria")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn (name = "id_skin")
    private Skin skin;


    public Arma() {
    }

    public Arma(String nombre, boolean statTrak, String imagenUrl, Categoria categoria, Skin skin) {
        this.nombre = nombre;
        this.statTrak = statTrak;
        this.imagenUrl = imagenUrl;
        this.categoria = categoria;
        this.skin = skin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isStatTrak() {
        return statTrak;
    }

    public void setStatTrak(boolean statTrak) {
        this.statTrak = statTrak;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }
}
