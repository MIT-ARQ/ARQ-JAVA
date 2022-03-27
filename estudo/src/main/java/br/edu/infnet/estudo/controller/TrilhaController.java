package br.edu.infnet.estudo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.estudo.model.domain.Trilha;
import br.edu.infnet.estudo.model.service.TrilhaService;

@Controller
public class TrilhaController {
	
	@Autowired
	private TrilhaService trilhaService;
	
	@GetMapping(value = "/trilha")
	public String cadastro() {
		return "Trilha/cadastro";
	}
	
	@GetMapping(value = "/trilhas")
	public String lista(Model model) {
		
		model.addAttribute("listagem", trilhaService.obterLista());
		
		return "Trilha/lista";
	}
	
	@PostMapping(value = "/trilha/incluir")
	public String incluir(Model model, Trilha trilha) {
		
		trilhaService.incluir(trilha);
		
		return "redirect:/trilhas";
	}
	
	@GetMapping(value = "/trilha/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		trilhaService.excluir(id);
		
		return "redirect:/trilhas";
	}
}
