package br.edu.infnet.estudo.model.test;

import java.time.LocalDateTime;

import br.edu.infnet.estudo.model.domain.Artigo;
import br.edu.infnet.estudo.model.domain.Questionario;
import br.edu.infnet.estudo.model.domain.Video;

public class ConteudoTeste {

	public static void main(String[] args) {
		
		Artigo artigo = new Artigo("Documentação da Infnet sobre testes de caixa preta","www.infnet.com/testes","22/02/2002");
		Video video = new Video("Ferramentas de automatização de testes","www.infnet.com/videos/jmeter.mp4","22/02/2002");
		Questionario questionario = new Questionario("Questionario sobre testes de caixa preta","www.infnet.com/testes/questionario1","25/02/2002");
	}

}
