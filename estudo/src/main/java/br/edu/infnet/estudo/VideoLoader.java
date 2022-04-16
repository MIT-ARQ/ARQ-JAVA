package br.edu.infnet.estudo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.estudo.model.domain.Usuario;
import br.edu.infnet.estudo.model.domain.Video;
import br.edu.infnet.estudo.model.service.VideoService;

@Order(2)
@Component
public class VideoLoader implements ApplicationRunner {

	@Autowired
	private VideoService videoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
	
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Video video = new Video();
		video.setNome("Video 1");
		video.setFormato("MP4");
		video.setDataPublicacao("1990-03-30");
		video.setDuracao((long)564646123);
		video.setPermiteDownload(false);
		video.setUsuario(usuario);
		
		videoService.incluir(video);
		
	}
}
