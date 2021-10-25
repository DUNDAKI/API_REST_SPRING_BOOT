package com.vigjoaopaulo.controller;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vigjoaopaulo.model.Logar;
import com.vigjoaopaulo.repository.LogarRepository;

@RestController
public class LogarController {
	
	@Autowired
	private LogarRepository repository;	

	
	
	@GetMapping("/usuario")
	public List<Logar>  listaAll() {
		 return repository.findAll();
		
	}
	
	
	@GetMapping("/usuario/{id}")
	public Logar getCliente(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	
	@PostMapping("/usuario")
	@Transactional
	public String addPessoa(@RequestBody @Valid Logar logar) {
		
		try {
			
			repository.save(logar);
		}catch (Exception e) {
			return "usuario existe" + e.getMessage();
		}
		
		
		
		
		return null;
	}
	
	
	/*
	 * @GetMapping("/pessoas/{id}")
	 *  public Pessoas getCliente(@PathVariable Long id)
	 * { return pessoaRepository.findById(id).get(); }
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
