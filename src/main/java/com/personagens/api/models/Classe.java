package com.personagens.api.models;

import javax.persistence.Entity;

@Entity(name = "TB_CLASSE")
public class Classe extends EntidadeAbstrata {

	
	private String nome;
	private String pericias;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPericias() {
		return pericias;
	}
	public void setPericias(String pericias) {
		this.pericias = pericias;
	}
	
	
	
}
