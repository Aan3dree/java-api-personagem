 package com.personagens.api.models;
 
import java.util.List;
 
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity(name = "TB_RACA")
public class Raca extends EntidadeAbstrata {

	private String nome;
	@OneToMany
	private List<Habilidade> habilidades;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Habilidade> getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(List<Habilidade> habilidades) {
		this.habilidades = habilidades;
	} 
 }

