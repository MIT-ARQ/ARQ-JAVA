package br.edu.infnet.estudo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.estudo.model.domain.Usuario;
import br.edu.infnet.estudo.model.service.ConteudoService;

@Controller
public class ConteudoController {
		
	@Autowired
	private ConteudoService conteudoService;
	
	@GetMapping(value = "/conteudos")
	public String lista(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {
		
		model.addAttribute("listagem", conteudoService.obterLista(usuario));
		
		return "Conteudo/lista";
	}
	
	@GetMapping(value = "/conteudo/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		conteudoService.excluir(id);
		
		return "redirect:/conteudos";
	}


}
