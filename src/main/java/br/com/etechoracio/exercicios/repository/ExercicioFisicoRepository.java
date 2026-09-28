package br.com.etechoracio.exercicios.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface ExercicioFisicoRepository
        extends JpaRepository<ExercicioFisicoRepository, Long> {

}



