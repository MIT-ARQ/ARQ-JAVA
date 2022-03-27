package br.edu.infnet.estudo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.estudo.model.domain.Video;
import br.edu.infnet.estudo.model.service.VideoService;

@Controller
public class VideoController {
	
	@Autowired
	private VideoService videoService;
	
	@GetMapping(value = "/video")
	public String cadastro() {
		return "Video/cadastro";
	}
	
	@GetMapping(value = "/videos")
	public String lista(Model model) {
		
		model.addAttribute("listagem", videoService.obterLista());
		
		return "Video/lista";
	}
	
	@PostMapping(value = "/video/incluir")
	public String incluir(Model model, Video video) {
		videoService.incluir(video);
		
		return "redirect:/videos";
	}
	
	@GetMapping(value = "/video/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		videoService.excluir(id);
		
		return "redirect:/videos";
	}

}
