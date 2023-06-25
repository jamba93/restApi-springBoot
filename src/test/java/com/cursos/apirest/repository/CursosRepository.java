package com.cursos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursos.apirest.model.Cursos;

@Repository
public interface CursosRepository extends JpaRepository<Cursos, Long>{
    //Cursos findById(long id);
}
