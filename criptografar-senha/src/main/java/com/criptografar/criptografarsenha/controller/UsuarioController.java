package com.criptografar.criptografarsenha.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.criptografar.criptografarsenha.model.UsuarioModel;
import com.criptografar.criptografarsenha.repository.UsuarioRepository;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    private final UsuarioRepository repository;
    
    public UsuarioController(UsuarioRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/listarTodos")
   public ResponseEntity<List<UsuarioModel>> listarTodos() {
    return ResponseEntity.ok(repository.findAll());

   }

    }

