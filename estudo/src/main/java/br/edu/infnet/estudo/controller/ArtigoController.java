package br.edu.infnet.estudo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArtigoController {
	
	@GetMapping(value = "/artigo")
	public String cadastro() {
		return "Artigo/cadastro";
	}
	
	@PostMapping(value = "/artigo/incluir")
	public String incluir() {
		return "index";
	}

}
