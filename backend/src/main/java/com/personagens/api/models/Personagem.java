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

	private Integer forca;
	private Integer inteligencia;
	private Integer constituicao;
	private Integer sabedoria;
	private Integer carisma;
	private Integer destreza;

	@OneToMany
	private List<Atributo> atributos;
	@OneToOne
	private Raca raca;
	@OneToOne
	private Classe classe;
	
	public String getNome() {
		return nome;
	}
	public Integer getDestreza() {
		return destreza;
	}
	public void setDestreza(Integer destreza) {
		this.destreza = destreza;
	}
	public Integer getCarisma() {
		return carisma;
	}
	public void setCarisma(Integer carisma) {
		this.carisma = carisma;
	}
	public Integer getSabedoria() {
		return sabedoria;
	}
	public void setSabedoria(Integer sabedoria) {
		this.sabedoria = sabedoria;
	}
	public Integer getConstituicao() {
		return constituicao;
	}
	public void setConstituicao(Integer constituicao) {
		this.constituicao = constituicao;
	}
	public Integer getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(Integer inteligencia) {
		this.inteligencia = inteligencia;
	}
	public Integer getForca() {
		return forca;
	}
	public void setForca(Integer forca) {
		this.forca = forca;
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