package br.edu.infnet.estudo.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.estudo.model.domain.Artigo;

@Service
public class ArtigoService {
	
	private static Map<Integer, Artigo> mapa = new HashMap<Integer, Artigo>();
	
	private static Integer id = 0;
	
	public Collection<Artigo> obterLista(){
		return mapa.values();
	}
	
	public void incluir(Artigo artigo) {
		artigo.setId(++id);
		mapa.put(id, artigo);
	}
	
	public void excluir(Integer id) {
		mapa.remove(id);
	}

	public Artigo obterPorId(Integer id) {
		return mapa.get(id);
	}
			
}
