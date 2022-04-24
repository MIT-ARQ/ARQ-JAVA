package br.edu.infnet.estudo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.estudo.model.domain.Artigo;
import br.edu.infnet.estudo.model.domain.Conteudo;
import br.edu.infnet.estudo.model.domain.Usuario;
import br.edu.infnet.estudo.model.repository.ConteudoRepository;

@Service
public class ConteudoService {
	
	@Autowired
	private ConteudoRepository conteudoRepository;
	
	public Collection<Conteudo> obterLista(Usuario usuario){
		return (Collection<Conteudo>) conteudoRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}
	
	public void excluir(Integer id) {
		conteudoRepository.deleteById(id);
	}
	
	public Conteudo obterPorId(Integer id) {
		return conteudoRepository.findById(id).get();
	}
			
}
