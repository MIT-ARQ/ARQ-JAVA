package br.edu.infnet.estudo.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.estudo.model.domain.Aluno;
import br.edu.infnet.estudo.model.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	public Collection<Aluno> obterLista(){
		return (Collection<Aluno>) alunoRepository.findAll();
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
