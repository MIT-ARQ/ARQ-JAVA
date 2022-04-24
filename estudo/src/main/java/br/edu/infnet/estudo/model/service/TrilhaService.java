package br.edu.infnet.estudo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import br.edu.infnet.estudo.model.domain.Trilha;
import br.edu.infnet.estudo.model.domain.Usuario;
import br.edu.infnet.estudo.model.repository.TrilhaRepository;

@Service
public class TrilhaService {
	
	@Autowired
	private TrilhaRepository trilhaRepository;
	
	public Collection<Trilha> obterLista(Usuario usuario){
		return (Collection<Trilha>) trilhaRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}
	
	public Collection<Trilha> obterLista(){
		return (Collection<Trilha>) trilhaRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
	}
	
	public void incluir(Trilha trilha) {
		trilhaRepository.save(trilha);
	}
	
	public void excluir(Integer id) {
		trilhaRepository.deleteById(id);
	}

	public Trilha obterPorId(Integer id) {
		return trilhaRepository.findById(id).get();
	}
			
			
}
