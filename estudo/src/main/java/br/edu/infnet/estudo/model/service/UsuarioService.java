package br.edu.infnet.estudo.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.estudo.model.domain.Usuario;
import br.edu.infnet.estudo.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario validar(String email, String senha) {
		
		return usuarioRepository.autenticacao(email, senha);
	}
	
	public void Incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
			
}
