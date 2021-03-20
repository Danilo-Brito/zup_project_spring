package com.danilo.brito.Covid_Zup.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Pessoa {
	@Id
	@GeneratedValue
	Long id;
	
	@NotBlank
	String nome;
	
	@Email
	@Column(unique = true)
	@NotBlank
	String email;
	
	@CPF
	@Column(unique = true)
	@NotBlank
	String cpf;
	
	@NotNull
	@JsonFormat(pattern = "dd/MM/yyyy")
	LocalDate nascimento;

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getCpf() {
		return cpf;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	
}
