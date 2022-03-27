package br.edu.infnet.estudo.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.estudo.model.domain.Artigo;
import br.edu.infnet.estudo.model.domain.Questionario;

@Service
public class QuestionarioService {
	
	private static Map<Integer, Questionario> mapa = new HashMap<Integer, Questionario>();
	
	private static Integer id = 0;
	
	public Collection<Questionario> obterLista(){
		return mapa.values();
	}
	
	public void incluir(Questionario questionario) {
		questionario.setId(++id);
		mapa.put(id, questionario);
	}
	
	public void excluir(Integer id) {
		mapa.remove(id);
	}

	public Questionario obterPorId(Integer id) {
		return mapa.get(id);
	}
			
}
