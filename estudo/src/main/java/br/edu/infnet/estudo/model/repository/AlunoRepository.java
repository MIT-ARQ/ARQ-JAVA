package br.edu.infnet.estudo.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;
import br.edu.infnet.estudo.model.domain.Aluno;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Integer>{

}
