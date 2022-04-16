package br.edu.infnet.estudo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.estudo.model.domain.Usuario;
import br.edu.infnet.estudo.model.domain.Video;
import br.edu.infnet.estudo.model.repository.VideoRepository;

@Service
public class VideoService {
	
	@Autowired
	private VideoRepository videoRepository;
	
	public Collection<Video> obterLista(Usuario usuario){
		return (Collection<Video>) videoRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}
	
	public void incluir(Video video) {
		videoRepository.save(video);
	}
	
	public void excluir(Integer id) {
		videoRepository.deleteById(id);
	}

	public Video obterPorId(Integer id) {
		return videoRepository.findById(id).get();
	}
			
}
