package com.personagens.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personagens.api.models.Atributo;
import com.personagens.api.repository.AtributoRepository;

@RestController
@RequestMapping(value="/api")
public class AtributoResource {

	@Autowired
	AtributoRepository atributoRepository;
	
	@GetMapping("/atributos")
	public List<Atributo> getAtributos(){
		return atributoRepository.findAll();
	}
	
	@PostMapping("/atributo")
	public Atributo addAtributo(@RequestBody Atributo atributo) {
		return atributoRepository.save(atributo);
	}
	
	@PutMapping("/atributo")
	public Atributo atualizaAtributo(@RequestBody Atributo atributo) {
		return atributoRepository.save(atributo);
	}
	
}
