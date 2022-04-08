package br.edu.infnet.estudo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.estudo.model.domain.Usuario;
import br.edu.infnet.estudo.model.service.UsuarioService;

@Component
public class UsuarioLoader implements ApplicationRunner {

	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// 

		Usuario usuario = new Usuario();
		usuario.setAdmin(true);
		usuario.setEmail("luis.claudio.jr@hotmail.com");
		usuario.setNome("Luis");
		usuario.setSenha("123");
		
		usuarioService.Incluir(usuario);
		
	}

}
