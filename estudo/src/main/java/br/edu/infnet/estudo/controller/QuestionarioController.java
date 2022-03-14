package br.edu.infnet.estudo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QuestionarioController {
	
	@GetMapping(value = "/questionario")
	public String cadastro() {
		return "Questionario/cadastro";
	}
	
	@PostMapping(value = "/questionario/incluir")
	public String incluir() {
		return "index";
	}

}
