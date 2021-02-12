package com.apirest.spring.webflux;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.apirest.spring.webflux.document.Funcionario;
import com.apirest.spring.webflux.services.FuncionarioService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FuncionarioRouterTest {
	
	  @Autowired
	  private WebTestClient webTestClient;
	  
	  @MockBean
	  private FuncionarioService funcionarioService;
	
	 @Test
	  public void testBuscar() {
		 
		 
		Funcionario func = new Funcionario("123", "Darwin", "2021-02-10", "Pudin de leite");
	    Mono<Funcionario> funcMono = Mono.just(func);		 
		
	    when(funcionarioService.findById("123")).thenReturn(funcMono);
	    
	    webTestClient
	      .get().uri("/diadodoce/{id}", "123")
	      .accept(MediaType.APPLICATION_JSON)
	      .exchange()
	      .expectStatus().isOk()
	      .expectBody(Funcionario.class).value(func1 -> func.getId(), equalTo("123"));
	 }
	
		
		  @Test public void testsaveFuncionario() {
		  
		  Funcionario func = new Funcionario("123", "Darwin", "2021-02-10", "Pudin de leite");
		  Mono<Funcionario> funcMono = Mono.just(func);
		  when(funcionarioService.save(func)).thenReturn(funcMono);
		  
		  webTestClient.post() 
		  	.uri("/diadodoce")
		  	.contentType(MediaType.APPLICATION_JSON) 
		  	.accept(MediaType.APPLICATION_JSON)
		  	.body(Mono.just(func), Funcionario.class) 
		  	.exchange()
		  	.expectBody(Funcionario.class);
		  
		  }
		 
	  
	   @Test
	    public void testDeleteFuncionarioById() {
				   
		   Mono<Void> voidReturn = Mono.empty();
		   
		   when(funcionarioService.deleteById("123")).thenReturn(voidReturn);
		   
	        webTestClient.delete()
	                .uri("/diadodoce/{id}", "123")
	                .exchange()
	                .expectStatus().isOk();
	                

	    }
	   
	   @Test
	    public void testListarFuncionario() {

		   
		  Funcionario f1 = new Funcionario("123", "Darwin", "2021-02-10", "Pudin de leite");
		  Funcionario f2 = new Funcionario("456", "Einstein", "2021-02-08", "Bolo de caramelo");
		  Funcionario f3 = new Funcionario("789", "Newton", "2021-02-09", "Torta de maça");
		  
		
		  when(funcionarioService.findAll()).thenReturn(Flux.just(f1,f2,f3));
		
	      webTestClient.get()
	                .uri("/diadodoce")	                
	                .exchange()
	                .expectStatus().isOk()
	                .expectBodyList(Funcionario.class);
	                  
	      verify(funcionarioService, times(1)).findAll();
	    }
	   
}
