package br.edu.infnet.estudo.model.test;

import java.time.LocalDateTime;

import br.edu.infnet.estudo.model.domain.Artigo;
import br.edu.infnet.estudo.model.domain.Questionario;
import br.edu.infnet.estudo.model.domain.Video;

public class QuestionarioTeste {

	public static void main(String[] args) {
		
		Questionario questionario1 = new Questionario("Questionário da Infnet sobre testes de caixa preta","www.infnet.com/testesCaixaPreta/questionario/4857",LocalDateTime.now());
		questionario1.setNivel("Iniciante");
		questionario1.setQtdQuestoes(42);
		questionario1.setTipo("Multipla escolha");
		System.out.println(questionario1);
		
		Questionario questionario2 = new Questionario("Questionário da Infnet sobre testes de caixa preta","www.infnet.com/testesCaixaPreta/questionario/4857",LocalDateTime.now());
		questionario1.setNivel("Iniciante");
		questionario1.setQtdQuestoes(42);
		questionario1.setTipo("Multipla escolha");
		System.out.println("Link de download: " + questionario2.obterLinkDownload());
	}

}
