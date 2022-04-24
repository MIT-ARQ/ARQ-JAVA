package br.edu.infnet.estudo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.estudo.model.domain.Conteudo;
import br.edu.infnet.estudo.model.domain.Trilha;
import br.edu.infnet.estudo.model.domain.Usuario;
import br.edu.infnet.estudo.model.service.AlunoService;
import br.edu.infnet.estudo.model.service.ConteudoService;
import br.edu.infnet.estudo.model.service.TrilhaService;

@Controller
public class TrilhaController {
	
	@Autowired
	private TrilhaService trilhaService;
	@Autowired
	private AlunoService alunoService;
	@Autowired
	private ConteudoService conteudoService;
	
	@GetMapping(value = "/trilha")
	public String cadastro(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {
		
		model.addAttribute("alunos", alunoService.obterLista(usuario));
		model.addAttribute("conteudos", conteudoService.obterLista(usuario));
		
		return "Trilha/cadastro";
	}
	
	@GetMapping(value = "/trilhas")
	public String lista(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {
		
		model.addAttribute("listagem", trilhaService.obterLista(usuario));	
		
		return "Trilha/lista";
	}
	
	@PostMapping(value = "/trilha/incluir")
	public String incluir(Model model, Trilha trilha, @RequestParam String[] idsConteudos, @SessionAttribute("usuarioLogado") Usuario usuario) {
		
		trilha.setUsuario(usuario);
		
		List<Conteudo> conteudos = new ArrayList<Conteudo>();
		
		for(String id : idsConteudos) {
			
			Conteudo conteudo = conteudoService.obterPorId(Integer.valueOf(id));			
			conteudos.add(conteudo);
		}
		
		trilha.setConteudos(conteudos);
		
		trilhaService.incluir(trilha);
		
		return "redirect:/trilhas";
	}
	
	@GetMapping(value = "/trilha/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		trilhaService.excluir(id);
		
		return "redirect:/trilhas";
	}
}
