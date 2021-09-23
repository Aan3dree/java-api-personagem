package com.personagens.api.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TB_PERSONAGEM")
public class Personagem {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nome;
	
	private int nivel;
	
	private BigDecimal exp;
	
	private int gold;
	
	private Atributos atributos;
	
	private Raca raca;
	
	private Classe classe;
	

}
