package com.apirest.spring.webflux;

import java.util.ArrayList;
import java.util.List;

import com.apirest.spring.webflux.document.Funcionario;

public class FuncionarioBuilder {
	
	private List<Funcionario> f = new ArrayList<Funcionario>();
	
	public FuncionarioBuilder() {
		this.f = new ArrayList<Funcionario>();
	}
	
	public static FuncionarioBuilder builder() {
		return new FuncionarioBuilder();
	}
	
	public FuncionarioBuilder addFuncionario(String id, String nome, String dataEntrada, String docePersonalizado) {
		this.f.add(new Funcionario(id, nome, dataEntrada, docePersonalizado));
		return this;
	}
}
