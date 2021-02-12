package com.apirest.spring.webflux.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.apirest.spring.webflux.document.Funcionario;
import com.apirest.spring.webflux.services.FuncionarioService;

import reactor.core.publisher.Mono;

@Component
public class FuncionarioHandler {
	
	@Autowired
	FuncionarioService service;
	
	public Mono<ServerResponse> listar(ServerRequest request){
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
				.body(service.findAll(), Funcionario.class);
	}
	
	public Mono<ServerResponse> buscar(ServerRequest request){
		String id = request.pathVariable("id");
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
				.body(service.findById(id), Funcionario.class);
	}
	
	public Mono<ServerResponse> salvar(ServerRequest request){
		final Mono<Funcionario> f = request.bodyToMono(Funcionario.class);
		return ServerResponse.ok()
				.contentType(MediaType.APPLICATION_JSON)
				.body(BodyInserters.fromPublisher(f.flatMap(service::save), Funcionario.class));
				
	}
	public Mono<ServerResponse> apagar(ServerRequest request){
		String id = request.pathVariable("id");
		Mono<Void> deleteItem = service.deleteById(id);
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
				.body(deleteItem, Void.class);
				
	}
}
