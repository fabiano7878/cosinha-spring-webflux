package com.apirest.spring.webflux;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.apirest.spring.webflux.document.Funcionario;
import com.apirest.spring.webflux.repository.FuncionarioRepository;

import reactor.core.publisher.Flux;

//@Component
/*public class DummyData implements CommandLineRunner{
	
	private final FuncionarioRepository funcionarioRepository;
	
	public DummyData(FuncionarioRepository pFuncionarioRepository) {
		this.funcionarioRepository = pFuncionarioRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		funcionarioRepository.deleteAll()		
		.thenMany(Flux.just("Fabiano", "Thaiany", "Clara", "Théo")
		.map(nome -> new Funcionario(UUID.randomUUID().toString(), nome, LocalDate.now().toString(), "Bolos"))		
		.flatMap(funcionarioRepository::save))
		.subscribe(System.out::println);		
	}
	
	
}*/
