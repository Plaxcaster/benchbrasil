package com.horizonleap.benchbrasil.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "EQUIPAMENTO")
@NamedNativeQuery(
        name = "INSERIR_EQUIPAMENTO",
        query = "INSERT INTO EQUIPAMENTO "
        + "( nome , area_academia , id_categoria_equipamento)"
        + " VALUES ( :nome , :area_academia , :id_categoria_equipamento);"
)
public class Equipamento {
    @Id
    @Column (name="id_equipamento")
    int id;

    @Column (name="nome")
    String nome;

    @Column (name="area_academia")
    String areaAcademia;

    @OneToOne
    @JoinColumn (name="id_categoria_equipamento" , referencedColumnName = "id_categoria_equipamento")
    CategoriaEquipamento categoria;

    public Equipamento(String areaAcademia, CategoriaEquipamento categoria, String nome) {
        this.areaAcademia = areaAcademia;
        this.categoria = categoria;
        this.nome = nome;
    }

    public String getAreaAcademia() {
        return areaAcademia;
    }

    public void setAreaAcademia(String areaAcademia) {
        this.areaAcademia = areaAcademia;
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

    public CategoriaEquipamento getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEquipamento categoria) {
        this.categoria = categoria;
    }
    
}
