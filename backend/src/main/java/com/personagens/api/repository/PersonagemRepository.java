package com.personagens.api.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.personagens.api.models.Personagem;

public interface PersonagemRepository extends JpaRepository<Personagem, Long>{

	Personagem findById(long id);
	
	Personagem removeById(long id);
}
