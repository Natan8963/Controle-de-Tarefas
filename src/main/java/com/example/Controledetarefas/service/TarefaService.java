package com.example.Controledetarefas.service;

import com.example.Controledetarefas.model.Tarefa;
import com.example.Controledetarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TarefaService {
    @Autowired
    private TarefaRepository repository;

    public String salvarTarefa(String nome, String status, String descricao){
        Tarefa tarefa = new Tarefa();
        tarefa.setNome(nome);
        tarefa.setStatus(status);
        tarefa.setDescricao(descricao);

        repository.save(tarefa);

        return "Tarefa salva com sucesso";

    }

    public String atualizarTarefa(Long id){
        return "";
    }

    public String concluriTarefa(Long id){
        return "";


    }

}
