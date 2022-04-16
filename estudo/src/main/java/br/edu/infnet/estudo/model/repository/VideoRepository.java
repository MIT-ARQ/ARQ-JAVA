package br.edu.infnet.estudo.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.estudo.model.domain.Artigo;
import br.edu.infnet.estudo.model.domain.Video;

@Repository
public interface VideoRepository extends CrudRepository<Video, Integer>{
	
	@Query("from Video v where v.usuario.id = :id")
	Collection<Video> findAll(Integer id, Sort by);
}
