package com.personagens.api.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TB_ATRIBUTOS")
public class Atributos {

	private int forca;
	private int destreza;
	private int inteligencia;
	private int sabedoria;
	private int constituicao;
	private int carisma;
	
	public int modificador() {
		
	}
}
