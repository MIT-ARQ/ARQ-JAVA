package br.edu.infnet.estudo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.estudo.model.domain.Aluno;
import br.edu.infnet.estudo.model.domain.Usuario;
import br.edu.infnet.estudo.model.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	public Collection<Aluno> obterLista(Usuario usuario){
		return (Collection<Aluno>) alunoRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}
	
	public void incluir(Aluno aluno) {
		alunoRepository.save(aluno);
	}
	
	public void excluir(Integer id) {
		alunoRepository.deleteById(id);
	}

	public Aluno obterPorId(Integer id) {
		return alunoRepository.findById(id).get();
	}
			
}
