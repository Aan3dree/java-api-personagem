package com.personagens.api.models;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PERSONAGEM")
public class Personagem extends EntidadeAbstrata {

	private String nome;

	private Integer nivel;

	private BigDecimal exp;

	private BigDecimal gold;

	@OneToMany
	private List<Atributo> atributos;

	private Raca raca;

	private Classe classe;

}