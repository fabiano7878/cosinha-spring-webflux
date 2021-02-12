package com.apirest.spring.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.apirest.spring.webflux.document.Funcionario;

public interface FuncionarioRepository extends ReactiveMongoRepository<Funcionario, String>{

}
