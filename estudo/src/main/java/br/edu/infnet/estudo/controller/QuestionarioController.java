package br.edu.infnet.estudo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.estudo.model.domain.Questionario;
import br.edu.infnet.estudo.model.service.QuestionarioService;

@Controller
public class QuestionarioController {
	
	@Autowired
	private QuestionarioService questionarioService;
	
	@GetMapping(value = "/questionario")
	public String cadastro() {
		return "Questionario/cadastro";
	}
	
	@GetMapping(value = "/questionarios")
	public String lista(Model model) {
		
		model.addAttribute("listagem", questionarioService.obterLista());
		
		return "Questionario/lista";
	}
	
	@PostMapping(value = "/questionario/incluir")
	public String incluir(Model model, Questionario questionario) {
		questionarioService.incluir(questionario);
		
		return "redirect:/questionarios";
	}
	
	@GetMapping(value = "/questionario/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		questionarioService.excluir(id);
		
		return "redirect:/questionarios";
	}

}
