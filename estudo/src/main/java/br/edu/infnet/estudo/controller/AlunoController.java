package br.edu.infnet.estudo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AlunoController {
	
	@GetMapping(value = "/aluno")
	public String cadastro() {
		return "Aluno/cadastro";
	}
	
	@PostMapping(value = "/aluno/incluir")
	public String incluir() {
		return "index";
	}

}
