package com.example.Controledetarefas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tarefa {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO

    )
    private Long id;
    private String nome;
    private  String status;
    private String descricao;



    public Long getId() {
        return id;

    }


    public String getNome(){
        return nome;
    }

    public String getStatus(){
        return status;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDescricao( String descricao ) {
        this.descricao = descricao;
    }



}


