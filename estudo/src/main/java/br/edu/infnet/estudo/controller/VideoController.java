package br.edu.infnet.estudo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VideoController {
	
	@GetMapping(value = "/video")
	public String cadastro() {
		return "Video/cadastro";
	}
	
	@PostMapping(value = "/video/incluir")
	public String incluir() {
		return "index";
	}

}
