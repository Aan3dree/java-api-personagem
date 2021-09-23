package com.personagens.api.models;

import javax.persistence.Entity;

@Entity(name= "TB_HABILIDADES")
public class Habilidade extends EntidadeAbstrata {
	
	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
