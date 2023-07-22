package com.crud.apilibros.repositorio;

import com.crud.apilibros.modelo.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepositorio  extends JpaRepository<Libro, Integer> {
}
