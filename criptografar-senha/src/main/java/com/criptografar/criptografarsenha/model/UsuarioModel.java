package com.criptografar.criptografarsenha.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Usuario")


public class UsuarioModel {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
@Column(unique = true)
private String login;
private String password;
}