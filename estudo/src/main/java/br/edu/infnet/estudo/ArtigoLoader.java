package br.edu.infnet.estudo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.estudo.model.domain.Artigo;
import br.edu.infnet.estudo.model.domain.Usuario;
import br.edu.infnet.estudo.model.service.ArtigoService;

@Order(4)
@Component
public class ArtigoLoader implements ApplicationRunner {

	@Autowired
	private ArtigoService artigoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Artigo artigo = new Artigo();
		artigo.setNome("Artigo 1");
		artigo.setAutor("Luis Ribeiro");
		artigo.setDataPublicacao("1990-03-30");
		artigo.setQtdPaginas(84);
		artigo.setEhAcademico(false);
		artigo.setUsuario(usuario);
		
		artigoService.incluir(artigo);
		
	}
}
