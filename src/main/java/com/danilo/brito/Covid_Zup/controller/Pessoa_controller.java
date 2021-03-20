package com.danilo.brito.Covid_Zup.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danilo.brito.Covid_Zup.entity.Pessoa;
import com.danilo.brito.Covid_Zup.repository.Pessoa_repository;

@RestController
@RequestMapping("/zup_vacina/pessoa")
public class Pessoa_controller {
	
	private Pessoa_repository pessoa_repository;

	public Pessoa_controller(Pessoa_repository pessoa_repository) {
		
		this.pessoa_repository = pessoa_repository;
	}
	
	@PostMapping
	ResponseEntity <Pessoa> cadastro_pessoa( @RequestBody @Valid Pessoa pessoa) {
		
		pessoa_repository.save(pessoa);
		
		return ResponseEntity.created(null).body(pessoa);
	}
}

