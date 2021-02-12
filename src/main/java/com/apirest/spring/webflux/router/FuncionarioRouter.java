package com.apirest.spring.webflux.router;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.apirest.spring.webflux.handler.FuncionarioHandler;

@Configuration
public class FuncionarioRouter {
	
	@Bean
	public RouterFunction<ServerResponse> route(FuncionarioHandler handler){		
		return RouterFunctions				
				.route(RequestPredicates.GET("/diadodoce").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), handler::listar)
				.andRoute(RequestPredicates.GET("/diadodoce/{id}").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), handler::buscar)
				.andRoute(RequestPredicates.POST("/diadodoce").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), handler::salvar)
				.andRoute(RequestPredicates.DELETE("/diadodoce/{id}").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), handler::apagar);		
	}
}
