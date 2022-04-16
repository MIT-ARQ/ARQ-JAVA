package br.edu.infnet.estudo.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.estudo.model.domain.Artigo;

@Repository
public interface ArtigoRepository extends CrudRepository<Artigo, Integer>{

	@Query("from Artigo a where a.usuario.id = :id")
	Collection<Artigo> findAll(Integer id, Sort by);
}
