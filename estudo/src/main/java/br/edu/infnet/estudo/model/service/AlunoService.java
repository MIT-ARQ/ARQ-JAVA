package br.edu.infnet.estudo.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.estudo.model.domain.Aluno;
import br.edu.infnet.estudo.model.domain.Artigo;

@Service
public class AlunoService {
	
	private static Map<Integer, Aluno> mapa = new HashMap<Integer, Aluno>();
	
	private static Integer id = 0;
	
	public Collection<Aluno> obterLista(){
		return mapa.values();
	}
	
	public void incluir(Aluno aluno) {
		aluno.setId(++id);
		mapa.put(id, aluno);
	}
	
	public void excluir(Integer id) {
		mapa.remove(id);
	}

	public Aluno obterPorId(Integer id) {
		return mapa.get(id);
	}
			
}
