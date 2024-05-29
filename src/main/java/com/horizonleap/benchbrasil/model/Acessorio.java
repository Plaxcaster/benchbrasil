package com.horizonleap.benchbrasil.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Acessorio {

    @Id
    @GeneratedValue()
    @Column(name = "id_acessorio")
    int id;
    @Column(name = "nome")
    String nome;
    @Column (name = "quantidade")
    int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
