package com.horizonleap.benchbrasil.service;

import javax.inject.Inject;

import com.horizonleap.benchbrasil.model.CategoriaEquipamento;
import com.horizonleap.benchbrasil.model.Equipamento;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

public class GerirEquipamento {

    @PersistenceContext
    EntityManager em;

    @Inject
    CategoriaEquipamento categoriaEquipamento;
    @Inject
    Equipamento equipamento;

    public void cadastrarCategoriaEquipamento(String nome, String fabricante, String musculoAlvo, int diasManutencao){
        // CategoriaEquipamento categoria = new CategoriaEquipamento(nome, fabricante, musculo_alvo, dias_manutencao);

        String queryName = "INSERIR_CATEGORIA";
        TypedQuery<CategoriaEquipamento> query = em.createNamedQuery(queryName, CategoriaEquipamento.class);

        query.setParameter("nome" , nome);
        query.setParameter("fabricante" , fabricante);
        query.setParameter("musculo_alvo" , musculoAlvo);
        query.setParameter("dias_manutencao" , diasManutencao);

        query.executeUpdate();


        
    }
    public void registrarEquipamento(String nome, String areaAcademia, CategoriaEquipamento categoria){

        String queryName = "INSERIR_EQUIPAMENTO";
        TypedQuery<Equipamento> query = em.createNamedQuery(queryName, Equipamento.class);

        query.setParameter("nome" , nome);
        query.setParameter("area_academia" , areaAcademia);
        query.setParameter("id_categoria_equipamento" , categoria.getId());


        query.executeUpdate();
        
    }
}
