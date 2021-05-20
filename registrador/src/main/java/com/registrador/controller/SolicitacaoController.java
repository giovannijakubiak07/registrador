package com.registrador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registrador.model.Solicitacao;

import service.SolicitacaoService;

@RestController
@RequestMapping("/solicitacao")
public class SolicitacaoController {
	
	@Autowired
	private SolicitacaoService solicitacaoService;
    
	@PostMapping
	public ResponseEntity<Solicitacao> salvaSolicitacao(@RequestBody Solicitacao solicitacao) {
		
		solicitacaoService.save(solicitacao);
		return ResponseEntity.status(HttpStatus.CREATED).body(solicitacao);
	}
	
	@GetMapping
	public List<String> obtemCidades(String estado) {
		return null;
	}
	
	
}
