package com.danilo.brito.Covid_Zup.repository;

import org.springframework.data.repository.CrudRepository;

import com.danilo.brito.Covid_Zup.entity.Pessoa;
import com.danilo.brito.Covid_Zup.entity.Vacina;

public interface Vacina_repository extends CrudRepository<Vacina, Long>{

}
