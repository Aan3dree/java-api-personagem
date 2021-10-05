package com.personagens.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personagens.api.models.Personagem;
import com.personagens.api.repository.PersonagemRepository;

@RestController
@RequestMapping(value="/api")
public class PersonagemResource {
	
	@Autowired
	PersonagemRepository personagemRepository;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/personagens")
	public List<Personagem> getPersonagens(){
		return personagemRepository.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/personagem/{id}")
	public Personagem getPersonagem(@PathVariable(value="id") long id) {
		return personagemRepository.findById(id);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/personagem")
	public Personagem addPersonagem(@RequestBody Personagem personagem) {
		return personagemRepository.save(personagem);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/personagem")
	public Personagem updatePersonagem(@RequestBody Personagem personagem) {
		return personagemRepository.save(personagem);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/personagem")
	public void deletePersonagem(@RequestBody Personagem personagem) {
		personagemRepository.delete(personagem);
	}

}
