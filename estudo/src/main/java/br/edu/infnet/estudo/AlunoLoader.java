package br.edu.infnet.estudo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.estudo.model.domain.Aluno;
import br.edu.infnet.estudo.model.domain.Usuario;
import br.edu.infnet.estudo.model.service.AlunoService;

@Order(2)
@Component
public class AlunoLoader implements ApplicationRunner {

	@Autowired
	private AlunoService alunoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// 
		
		Usuario usuario = new Usuario();
		usuario.setId(1);

		Aluno aluno = new Aluno();
		aluno.setNome("Luis Ribeiro");
		aluno.setProfissao("Analista de sistemas");
		aluno.setDataNascimento("1990-03-30");
		aluno.setUsuario(usuario);
		
		alunoService.incluir(aluno);
		
	}
}
