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
	
	private static Map<Integer, Aluno> mapa = new HashMap<Integer, Aluno>();
	
	private static Integer id = 0;
	
	public Collection<Aluno> obterLista(){
		//return mapa.values();
		return (Collection<Aluno>) alunoRepository.findAll();
	}
	
	public void incluir(Aluno aluno) {
		//aluno.setId(++id);
		//mapa.put(id, aluno);
		alunoRepository.save(aluno);
	}
	
	public void excluir(Integer id) {
		//mapa.remove(id);
		alunoRepository.deleteById(id);
	}

	public Aluno obterPorId(Integer id) {
		return mapa.get(id);
	}
			
}
