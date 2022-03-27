package br.edu.infnet.estudo.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.estudo.model.domain.Artigo;
import br.edu.infnet.estudo.model.domain.Video;

@Service
public class VideoService {
	
	private static Map<Integer, Video> mapa = new HashMap<Integer, Video>();
	
	private static Integer id = 0;
	
	public Collection<Video> obterLista(){
		return mapa.values();
	}
	
	public void incluir(Video video) {
		video.setId(++id);
		mapa.put(id, video);
	}
	
	public void excluir(Integer id) {
		mapa.remove(id);
	}

	public Video obterPorId(Integer id) {
		return mapa.get(id);
	}
			
}
