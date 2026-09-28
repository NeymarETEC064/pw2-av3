package br.com.etechoracio.exercicios.entity;

import br.com.etechoracio.exercicios.Enums.NivelDificuldadeEnum;
import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Exercício Físico")
public class ExercicioFisico {
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "grupoMuscular")
    private String grupoMuscolar;
    @Column(name = "imagem")
    private String imagem;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "numeroSeries")
    private int numeroSeries;
    @Column(name = "numeroRepeticoes")
    private int numeroRepeticoes;
    @Column(name = "NivelDificuldade")
    @Enumerated(EnumType.STRING)
    private NivelDificuldadeEnum nivelDificuldade;
    @Column(name = "cargaSugerida")
    private double cargaSugerida;
}
