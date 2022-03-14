package br.edu.infnet.estudo.model.test;

import java.time.LocalDateTime;

import br.edu.infnet.estudo.model.domain.Artigo;
import br.edu.infnet.estudo.model.domain.Questionario;
import br.edu.infnet.estudo.model.domain.Video;

public class VideoTeste {

	public static void main(String[] args) {
		
		Video video1 = new Video("Ferramentas de automatização de testes","www.infnet.com/videos/jmeter.mp4",LocalDateTime.now());
		video1.setDuracao((long) 10855);
		video1.setFormato("MP4");
		video1.setPermiteDownload(true);
		System.out.println(video1);
		
		Video video2 = new Video("Ferramentas de automatização de testes","www.infnet.com/videos/jmeter.mp4",LocalDateTime.now());
		video2.setDuracao((long) 10855);
		video2.setFormato("MP4");
		video2.setPermiteDownload(true);
		System.out.println("Link de download: " + video2.obterLinkDownload());
	}

}
