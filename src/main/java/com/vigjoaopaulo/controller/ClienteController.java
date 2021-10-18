package com.vigjoaopaulo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vigjoaopaulo.model.Pessoas;
import com.vigjoaopaulo.repository.ClienteRepository;

@RestController

public class ClienteController {

	@Autowired
	private ClienteRepository pessoaRepository;	

	
	@PostMapping("/pessoas")
	public Pessoas addPessoa(@RequestBody Pessoas pessoa) {		
		return pessoaRepository.save(pessoa);
	}
	
	@GetMapping("/pessoas")
	public List<Pessoas>  listaAll() {
		 return pessoaRepository.findAll();
		
	}
	
	
	@GetMapping("/pessoas/{id}")
	public Pessoas getCliente(@PathVariable Long id) {
		return pessoaRepository.findById(id).get();
	}	
		
	@DeleteMapping("/pessoas/{id}")
	public void deleteCliente(@PathVariable Long id) {
		pessoaRepository.deleteById(id);		
	}
	
	
	@PutMapping("/pessoas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Pessoas updateCliente(@PathVariable Long id,  @RequestBody Pessoas cliente) {
		
		Pessoas newObj = pessoaRepository.findById(id).get();
		
		newObj.setNome(cliente.getNome());
		
		
		return  pessoaRepository.save(newObj);
	
	
	}
	
}
