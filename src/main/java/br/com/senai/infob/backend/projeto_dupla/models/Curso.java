package br.com.senai.infob.backend.projeto_dupla.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name="curso")
public class Curso {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name="id")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="descricao")
    private String descricao;

    @Column(name="data_inicio")
    private LocalDate dataInicio;

    @Column(name="data_termino")
    private LocalDate dataTermino;

    public Curso() {
    }

    public Curso(Integer id, String nome, String descricao, LocalDate dataInicio, LocalDate dataTermino) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }

    
}

