package com.registrador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.EstadoCidadeService;

/**
 * EstadoCidadeController
 */
@RestController
@RequestMapping("/estado")
public class EstadoCidadeController {

    @Autowired
	private EstadoCidadeService estadoCidadeService;
    
	
	
	@GetMapping
	public List<String> obtemCidades(String estado) {
		return null;
	}

    @GetMapping
	public List<String> obtemCidades() {
		return null;
	}
    
    
}