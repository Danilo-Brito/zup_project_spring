package com.danilo.brito.Covid_Zup.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.danilo.brito.Covid_Zup.entity.Vacina;
import com.danilo.brito.Covid_Zup.repository.Vacina_repository;

@RestController
@RequestMapping("/zup_vacina/vacina")
public class Vacina_controller {
	
	private Vacina_repository vacina_repository;
	
	public Vacina_controller(Vacina_repository vacina_repository) {
		
		this.vacina_repository = vacina_repository;
	}
	
	@PostMapping
	ResponseEntity <Vacina> cadastro_vacina(@RequestBody @Valid Vacina vacina){
		
		vacina_repository.save(vacina);
		
		return ResponseEntity.created(null).body(vacina);
	}
}
