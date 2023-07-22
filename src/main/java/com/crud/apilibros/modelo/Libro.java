package com.crud.apilibros.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String titulo;

    private String autor;

    private Integer anio_publicacion;

    private Integer numero_paginas;

    private String idioma;


    public Libro(Integer id, String titulo, String autor, Integer anio_publicacion, Integer numero_paginas, String idioma) {
        this.Id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anio_publicacion = anio_publicacion;
        this.numero_paginas = numero_paginas;
        this.idioma = idioma;
    }
    public Libro( String titulo, String autor, Integer anio_publicacion, Integer numero_paginas, String idioma) {

        this.titulo = titulo;
        this.autor = autor;
        this.anio_publicacion = anio_publicacion;
        this.numero_paginas = numero_paginas;
        this.idioma = idioma;
    }
    public Libro() {

    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnio_publicacion() {
        return anio_publicacion;
    }

    public void setAnio_publicacion(Integer anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    public Integer getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(Integer numero_paginas) {
        this.numero_paginas = numero_paginas;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
