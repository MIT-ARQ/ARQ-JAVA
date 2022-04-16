package br.edu.infnet.estudo.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.estudo.model.domain.Questionario;

@Repository
public interface QuestionarioRepository extends CrudRepository<Questionario, Integer>{

	@Query("from Questionario q where q.usuario.id = :id")
	Collection<Questionario> findAll(Integer id, Sort by);
	

}
