package br.com.etechoracio.exercicios.controller;

import br.com.etechoracio.exercicios.Repository.ExercicioFisicoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Exercicios")
public class ExercicioFisicoController {

public class ExercicioFisico(ExercicioFisicoRepository repository){
    this.repository = repository;
}
@GetMapping
public ResponseEntity<List<ExercicioFisicoRepository>> lista = Repository.findAll();

@GetMapping("/{id}")
    public ResponseEntity<list<ExercicioFisicoRepository>> listarTodos(){
    List<ExercicioFisico> lista = repository.findAll();
}

}