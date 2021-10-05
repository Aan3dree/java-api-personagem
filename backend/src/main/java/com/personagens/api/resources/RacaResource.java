package com.personagens.api.resources;
import com.personagens.api.models.Raca;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personagens.api.repository.RacaRepository;

@RestController
@RequestMapping(value="/api")
public class RacaResource {

	@Autowired
	RacaRepository racaRepository;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/racas")
	public List<Raca> getRacas(){
		return racaRepository.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/raca")
	public Raca addRaca(@RequestBody Raca raca) {
		return racaRepository.save(raca);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/raca")
	public Raca updateRaca(@RequestBody Raca raca) {
		return racaRepository.save(raca);
	}
}
