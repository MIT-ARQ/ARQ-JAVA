package br.edu.infnet.estudo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.estudo.model.domain.Usuario;
import br.edu.infnet.estudo.model.service.UsuarioService;

@Controller
public class AcessoController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/")
	public String telaIndex() {
		return "index";
	}
	
	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String login(Model model, @RequestParam String email, @RequestParam String senha) {
	
		Usuario usuario = usuarioService.validar(email, senha);
		
		if(usuario != null) {
			model.addAttribute("usuarioLogado", usuario);
			return "index";
		}
		
		String msg = "Credenciais inválidas.";
		
		model.addAttribute("mensagem", msg);
		
		return "login";
	}
}
