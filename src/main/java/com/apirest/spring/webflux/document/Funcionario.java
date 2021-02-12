package com.apirest.spring.webflux.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Funcionario {

	@Id
	private String id;	
	private String nome;
	private String dataEntrada;
	private String docePersonalizado;
		
	/**
	 * @param id
	 * @param nome
	 * @param dataEntrada
	 * @param docePersonalizado
	 */
	public Funcionario(String id, String nome, String dataEntrada, String docePersonalizado) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataEntrada = dataEntrada;
		this.docePersonalizado = docePersonalizado;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the dataEntrada
	 */
	public String getDataEntrada() {
		return dataEntrada;
	}
	/**
	 * @param dataEntrada the dataEntrada to set
	 */
	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	/**
	 * @return the docePersonalizado
	 */
	public String getDocePersonalizado() {
		return docePersonalizado;
	}
	/**
	 * @param docePersonalizado the docePersonalizado to set
	 */
	public void setDocePersonalizado(String docePersonalizado) {
		this.docePersonalizado = docePersonalizado;
	}
}
