package com.apirest.spring.webflux.services;

import com.apirest.spring.webflux.document.Funcionario;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface FuncionarioService {
	
	Flux<Funcionario> findAll();
	
	Mono<Funcionario> findById(String id);
	
	Mono<Funcionario> save(Funcionario f);
	
	Mono<Void> deleteById(String id); 

}
