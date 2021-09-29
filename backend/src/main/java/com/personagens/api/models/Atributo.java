package com.personagens.api.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TB_ATRIBUTOS")
public class Atributo extends EntidadeAbstrata{

	private String nome;
	private Integer valor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
}
