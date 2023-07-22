package com.crud.apilibros.controlador;

import com.crud.apilibros.modelo.Libro;
import com.crud.apilibros.servicio.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class LibroControlador {

        @Autowired
        private LibroServicio libroServicio;

        @GetMapping("/libros")
        public List<Libro> listarLibros(){
            return libroServicio.listarLibros();
        }

        @GetMapping("/libros/{id}")
        public ResponseEntity<Libro> obtenerLibro(@PathVariable Integer id){
                try {
                        Libro libro = libroServicio.obtenerLibroxId(id);
                        return new ResponseEntity<Libro>(libro, HttpStatus.OK);

                }catch (Exception exception){

                        return new ResponseEntity<Libro>(HttpStatus.NOT_FOUND);


                }

        }

        @PostMapping("/libros")
        public void registrarLibro(@RequestBody Libro libro){
                libroServicio.guardarLibro(libro);
        }


        @PutMapping("/libros/{id}")
        public ResponseEntity<?> actLibro(@RequestBody Libro libro , @PathVariable Integer id){

                try {
                        Libro librotmp = libroServicio.obtenerLibroxId(id);

                        librotmp.setAutor(libro.getAutor());
                        librotmp.setIdioma(libro.getIdioma());
                        librotmp.setTitulo(libro.getTitulo());
                        librotmp.setNumero_paginas(libro.getNumero_paginas());
                        librotmp.setAnio_publicacion(libro.getAnio_publicacion());



                        libroServicio.guardarLibro(libro);
                        return new ResponseEntity<Libro>(HttpStatus.OK);

                }catch (Exception exception){

                        return new ResponseEntity<Libro>(HttpStatus.NOT_FOUND);
                }


        }

        @DeleteMapping("/libros/{id}")

        public void eliminarLibro(@PathVariable Integer id ){
                libroServicio.eliminarLibro(id);
        }


}
