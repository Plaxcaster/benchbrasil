package com.horizonleap.benchbrasil.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;


public class Funcionario {

    @Id
    @Column(name = "id_funcionario")
    int id;
    @Column(name = "matricula")
    int matricula;
    @Column(name = "nome")
    String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
