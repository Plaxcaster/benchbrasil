package com.horizonleap.benchbrasil.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "CATEGORIA_EQUIPAMENTO")
@NamedNativeQuery(
        name = "INSERIR_CATEGORIA",
        query = "INSERT INTO CATEGORIA_EQUIPAMENTO "
        + "( nome , fabricante , musculo_alvo, dias_manutencao )"
        + " VALUES ( :nome , :fabricante , :musculo_alvo, :dias_manutencao);"
)
public class CategoriaEquipamento {

    @Id
    @GeneratedValue()
    @Column(name = "id_categoria_equipamento")
    int id;

    @Column(name = "nome")
    String nome;

    @Column(name = "fabricante")
    String fabricante;

    @Column(name = "musculo_alvo")
    String musculoAlvo;

    @Column(name = "dias_manutencao")
    int diasManutencao;

    public CategoriaEquipamento(String fabricante, String musculoAlvo, String nome, int diasManutencao) {
        this.diasManutencao = diasManutencao;
        this.fabricante = fabricante;
        this.musculoAlvo = musculoAlvo;
        this.nome = nome;
    }


	public String getMusculoAlvo() {
        return musculoAlvo;
    }

    public void setMusculoAlvo(String musculoAlvo) {
        this.musculoAlvo = musculoAlvo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
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

    public int getDiasManutencao() {
        return diasManutencao;
    }

    public void setDiasManutencao(int diasManutencao) {
        this.diasManutencao = diasManutencao;
    }

}
