package br.edu.infnet.estudo.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.estudo.model.domain.Conteudo;

@Repository
public interface ConteudoRepository extends CrudRepository<Conteudo, Integer>{

	@Query("from Conteudo a where a.usuario.id = :id")
	Collection<Conteudo> findAll(Integer id, Sort by);
}
