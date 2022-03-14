package br.edu.infnet.estudo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConteudoController {
	
	@GetMapping(value = "/conteudo")
	public String cadastro() {
		return "index";
	}
	
	@PostMapping(value = "/conteudo/incluir")
	public String incluir() {
		return "index";
	}

}
