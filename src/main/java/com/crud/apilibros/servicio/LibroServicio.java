package com.crud.apilibros.servicio;

import com.crud.apilibros.modelo.Libro;
import com.crud.apilibros.repositorio.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServicio {

        @Autowired
        private LibroRepositorio repositorio ;


        public List<Libro>listarLibros(){
            return repositorio.findAll();
        }

        public void guardarLibro(Libro libro){
            repositorio.save(libro);
        }


        public Libro obtenerLibroxId(Integer id ){

           return  repositorio.findById(id).get();

        }


        public void eliminarLibro(Integer id){
            repositorio.deleteById(id);
        }
}
