package br.edu.infnet.estudo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.estudo.model.domain.Artigo;
import br.edu.infnet.estudo.model.service.ArtigoService;

@Controller
public class ArtigoController {
	
	@Autowired
	private ArtigoService artigoService;
	
	@GetMapping(value = "/artigo")
	public String cadastro() {
		return "Artigo/cadastro";
	}
	
	@GetMapping(value = "/artigos")
	public String lista(Model model) {
		
		model.addAttribute("listagem", artigoService.obterLista());
		
		return "Artigo/lista";
	}
	
	@PostMapping(value = "/artigo/incluir")
	public String incluir(Model model, Artigo artigo) {
		
		artigoService.incluir(artigo);
		
		return "redirect:/artigos";
	}
	
	@GetMapping(value = "/artigo/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		artigoService.excluir(id);
		
		return "redirect:/artigos";
	}

}
