package com.personagens.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personagens.api.models.Habilidade;
import com.personagens.api.repository.HabilidadeRepository;

@RestController
@RequestMapping(value="/api")
public class HabilidadeResource {
	
	@Autowired
	HabilidadeRepository habilidadeRepository;
	
	@GetMapping("/habilidades")
	public List<Habilidade> getHabilidades(){
		return habilidadeRepository.findAll();
	}
	
	@PostMapping("/habilidade")
	public Habilidade addHabilidade(@RequestBody Habilidade habilidade) {
		return habilidadeRepository.save(habilidade);
	}
	
	@PutMapping("/habilidade")
	public Habilidade updateHabilidade(@RequestBody Habilidade habilidade) {
		return habilidadeRepository.save(habilidade);
	}
	
}
