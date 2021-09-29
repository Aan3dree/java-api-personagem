package com.personagens.api.models;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="TB_PERSONAGEM")
public class Personagem extends EntidadeAbstrata {

	private String nome;

	private Integer nivel;

	private BigDecimal exp;

	private BigDecimal gold;

	@OneToMany
	private List<Atributo> atributos;
	@OneToOne
	private Raca raca;
	@OneToOne
	private Classe classe;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getNivel() {
		return nivel;
	}
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	public BigDecimal getExp() {
		return exp;
	}
	public void setExp(BigDecimal exp) {
		this.exp = exp;
	}
	public BigDecimal getGold() {
		return gold;
	}
	public void setGold(BigDecimal gold) {
		this.gold = gold;
	}
	public List<Atributo> getAtributos() {
		return atributos;
	}
	public void setAtributos(List<Atributo> atributos) {
		this.atributos = atributos;
	}
	public Raca getRaca() {
		return raca;
	}
	public void setRaca(Raca raca) {
		this.raca = raca;
	}
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	

}