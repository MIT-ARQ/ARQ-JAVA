package br.edu.infnet.estudo.model.test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.estudo.model.domain.Aluno;
import br.edu.infnet.estudo.model.domain.Conteudo;
import br.edu.infnet.estudo.model.domain.Trilha;
import br.edu.infnet.estudo.model.domain.Video;

public class TrilhaTeste {

	public static void main(String[] args) {
		
		Video video1 = new Video("Ferramentas de automatização de testes","www.infnet.com/videos/jmeter.mp4",LocalDateTime.now());
		video1.setDuracao((long) 10855);
		video1.setFormato("MP4");
		video1.setPermiteDownload(true);
		
		List<Conteudo> conteudos = new ArrayList<Conteudo>();
		conteudos.add(video1);
		
		Aluno aluno = new Aluno("Luis",LocalDateTime.now(),"Programador");

		Trilha trilha = new Trilha();
		trilha.setNome("Angular");
		trilha.setCategoria("Front-End");
		trilha.setArea("Computação");
		trilha.setAluno(aluno);
		trilha.setConteudos(conteudos);
		System.out.println(trilha);
	}

}
