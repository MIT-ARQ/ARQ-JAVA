package br.edu.infnet.estudo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.estudo.model.domain.Questionario;
import br.edu.infnet.estudo.model.domain.Usuario;
import br.edu.infnet.estudo.model.service.QuestionarioService;

@Order(2)
@Component
public class QuestionarioLoader implements ApplicationRunner {

	@Autowired
	private QuestionarioService questionarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Questionario questionario = new Questionario();
		questionario.setNome("Questionario 1");
		questionario.setNivel("INICIANTE");
		questionario.setDataPublicacao("1990-03-30");
		questionario.setQtdQuestoes(54);
		questionario.setTipo("DISSERTATIVO");
		questionario.setUsuario(usuario);
		
		questionarioService.incluir(questionario);
		
	}
}
