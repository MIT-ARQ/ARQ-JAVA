package br.edu.infnet.estudo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.estudo.model.domain.Questionario;
import br.edu.infnet.estudo.model.domain.Usuario;
import br.edu.infnet.estudo.model.repository.QuestionarioRepository;

@Service
public class QuestionarioService {
	
	@Autowired
	private QuestionarioRepository questionarioRepository;
	
	public Collection<Questionario> obterLista(Usuario usuario){
		return (Collection<Questionario>) questionarioRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}
	
	public void incluir(Questionario questionario) {
		questionarioRepository.save(questionario);
	}
	
	public void excluir(Integer id) {
		questionarioRepository.deleteById(id);
	}

	public Questionario obterPorId(Integer id) {
		return questionarioRepository.findById(id).get();
	}
			
}
