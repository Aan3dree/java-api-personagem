package com.personagens.api.resources;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personagens.api.models.Classe;
import com.personagens.api.repository.ClasseRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value="/api")
public class ClasseResource {

	@Autowired
	ClasseRepository classeRepository;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/classes")
	public List<Classe> getClasses(){
		return classeRepository.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/classe")
	public Classe addClasse(@RequestBody Classe classe) {
		return classeRepository.save(classe);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/classe")
	public Classe updateClasse(@RequestBody Classe classe) {
		return classeRepository.save(classe); 
	}
}
