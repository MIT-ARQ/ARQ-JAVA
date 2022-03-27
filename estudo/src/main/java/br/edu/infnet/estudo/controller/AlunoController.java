package br.edu.infnet.estudo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.estudo.model.domain.Aluno;
import br.edu.infnet.estudo.model.service.AlunoService;

@Controller
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	@GetMapping(value = "/aluno")
	public String cadastro() {
		return "Aluno/cadastro";
	}
	
	@GetMapping(value = "/alunos")
	public String lista(Model model) {
		
		model.addAttribute("listagem", alunoService.obterLista());
		
		return "Aluno/lista";
	}
	
	@PostMapping(value = "/aluno/incluir")
	public String incluir(Model model, Aluno aluno) {
		
		alunoService.incluir(aluno);
		
		return "redirect:/alunos";
	}
	
	@GetMapping(value = "/aluno/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		alunoService.excluir(id);
		
		return "redirect:/alunos";
	}

}
