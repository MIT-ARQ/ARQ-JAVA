package br.edu.infnet.estudo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.estudo.model.domain.Artigo;
import br.edu.infnet.estudo.model.domain.Usuario;
import br.edu.infnet.estudo.model.repository.ArtigoRepository;

@Service
public class ArtigoService {
	
	@Autowired
	private ArtigoRepository artigoRepository;
	
	public Collection<Artigo> obterLista(Usuario usuario){
		return (Collection<Artigo>) artigoRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}
	
	public void incluir(Artigo artigo) {
		artigoRepository.save(artigo);
	}
	
	public void excluir(Integer id) {
		artigoRepository.deleteById(id);
	}

	public Artigo obterPorId(Integer id) {
		return artigoRepository.findById(id).get();
	}
			
}
