package br.edu.infnet.estudo.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.estudo.model.domain.Conteudo;
import br.edu.infnet.estudo.model.domain.Trilha;
import br.edu.infnet.estudo.model.domain.Usuario;

@Repository
public interface TrilhaRepository extends CrudRepository<Trilha, Integer>{

	@Query("from Trilha t where t.usuario.id = :id")
	Collection<Trilha> findAll(Integer id, Sort by);

	Collection<Trilha> findAll(Sort by);	
}
