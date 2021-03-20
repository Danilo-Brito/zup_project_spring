package com.danilo.brito.Covid_Zup.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Vacina {
	@Id
	@GeneratedValue
	Long id_vacina;
	
	@NotBlank
	String nome_vacina;
	
	@ManyToOne
	Pessoa pessoa;
	
	@NotNull
	LocalDate data_vacina;

	public Long getId_vacina() {
		return id_vacina;
	}

	public String getNome_vacina() {
		return nome_vacina;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public LocalDate getData_vacina() {
		return data_vacina;
	}
}
