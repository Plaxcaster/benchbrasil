package com.horizonleap.benchbrasil.model;

public class Equipamento {
    int id;
    String nome;
    String fabricante;
    String musculoAlvo;
    String areaAcademia;

    public String getAreaAcademia() {
        return areaAcademia;
    }

    public void setAreaAcademia(String areaAcademia) {
        this.areaAcademia = areaAcademia;
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
    
}
