package com.example.ApiRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @GetMapping
    public List<Topico> listar() {
        return topicoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Topico> crear(@RequestBody Topico topico) {
        Topico nuevoTopico = topicoRepository.save(topico);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoTopico);
    }
}
