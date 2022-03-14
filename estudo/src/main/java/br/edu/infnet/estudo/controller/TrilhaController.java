package br.edu.infnet.estudo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TrilhaController {
	
	@GetMapping(value = "/trilha")
	public String cadastro() {
		return "Trilha/cadastro";
	}
	
	@PostMapping(value = "/trilha/incluir")
	public String incluir() {
		return "index";
	}

}
