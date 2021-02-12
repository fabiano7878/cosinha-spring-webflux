package com.apirest.spring.webflux.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.spring.webflux.document.Funcionario;
import com.apirest.spring.webflux.repository.FuncionarioRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class FuncionarioServiceImpl implements FuncionarioService{

	@Autowired
	FuncionarioRepository funcionarioRepository;
	
	public Flux<Funcionario> findAll() {
		return funcionarioRepository.findAll();
	}

	public Mono<Funcionario> findById(String id) {		
		return funcionarioRepository.findById(id);
	}

	public Mono<Funcionario> save(Funcionario f) {		
		return funcionarioRepository.save(f);
	}

	@Override
	public Mono<Void> deleteById(String id) {					
		return funcionarioRepository.deleteById(id);
	}
	
}
