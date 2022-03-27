package br.edu.infnet.estudo.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.estudo.model.domain.Artigo;
import br.edu.infnet.estudo.model.domain.Trilha;

@Service
public class TrilhaService {
	
	private static Map<Integer, Trilha> mapa = new HashMap<Integer, Trilha>();
	
	private static Integer id = 0;
	
	public Collection<Trilha> obterLista(){
		return mapa.values();
	}
	
	public void incluir(Trilha trilha) {
		trilha.setId(++id);
		mapa.put(id, trilha);
	}
	
	public void excluir(Integer id) {
		mapa.remove(id);
	}

	public Trilha obterPorId(Integer id) {
		return mapa.get(id);
	}
			
}
