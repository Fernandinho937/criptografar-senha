package com.criptografar.criptografarsenha.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.criptografar.criptografarsenha.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {

public Optional<UsuarioModel> findByLogin(String login);

}