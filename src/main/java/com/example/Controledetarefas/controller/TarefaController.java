package com.example.Controledetarefas.controller;


import com.example.Controledetarefas.controller.dto.TarefaDTO;
import com.example.Controledetarefas.service.TarefaService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class TarefaController {

    @Autowired
    private TarefaService service;


    @PostMapping("/salvarTarefa")
    public ResponseEntity<String>salvarTarefa(@RequestBody TarefaDTO dto){

        String msg =service.salvarTarefa(dto.getNome(),dto.getStatus(),dto.getDescricao());
           return ResponseEntity.ok(msg);



    }







}
