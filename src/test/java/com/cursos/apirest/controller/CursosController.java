package com.cursos.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cursos.apirest.model.Cursos;
import com.cursos.apirest.repository.CursosRepository;



@CrossOrigin(origins = "http://localhost:8100", methods = { RequestMethod.DELETE, RequestMethod.GET, 
     RequestMethod.POST, RequestMethod.PUT} )

 
@RestController
@RequestMapping(value="/cursos")
public class CursosController {

    @Autowired
    private CursosRepository cursosRepository;

    @GetMapping
    public List<Cursos> listaCursos(){
        return cursosRepository.findAll();
    }

    @GetMapping("/{codigo}")
    public Cursos buscarCurso(@PathVariable(value="codigo") long codigo){
       return cursosRepository.findById(codigo).get();
    }

    @PostMapping
    public Cursos salvaCurso(@RequestBody Cursos cursos){
        return cursosRepository.save(cursos);
    }

    @DeleteMapping("/{codigo}")
    public Cursos deletaCurso(@PathVariable(value="codigo")  Long codigo){
        Cursos cursos = cursosRepository.findById(codigo).get();
        cursosRepository.delete(cursos); 
        return cursos; 
    }

    @PutMapping
    public Cursos atualizaCurso(@RequestBody Cursos cursos){
        return cursosRepository.save(cursos);
    }


}
