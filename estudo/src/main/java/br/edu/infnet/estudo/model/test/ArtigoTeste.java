package br.edu.infnet.estudo.model.test;

import java.time.LocalDateTime;

import br.edu.infnet.estudo.model.domain.Artigo;
import br.edu.infnet.estudo.model.domain.Questionario;
import br.edu.infnet.estudo.model.domain.Video;

public class ArtigoTeste {

	public static void main(String[] args) {
		
		Artigo artigo1 = new Artigo("Documentação da Infnet sobre testes de caixa preta","www.infnet.com/testesCaixaPreta","22/02/2002");
		artigo1.setEhAcademico(true);
		artigo1.setQtdPaginas(59);
		artigo1.setAutor("Ribeiro, Luis");
		System.out.println(artigo1);
		
		Artigo artigo2 = new Artigo("Documentação da Infnet sobre testes de caixa preta","www.infnet.com/testes","");
		artigo1.setEhAcademico(true);
		artigo1.setQtdPaginas(59);
		artigo1.setAutor("Ribeiro, Luis");
		System.out.println("Link de download: " + artigo2.obterLinkDownload());
	}

}
