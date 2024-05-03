package br.com.cotiinformatica.infrastructure.repositories;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.cotiinformatica.domain.entites.Tarefa;

public interface TarefaRepository extends MongoRepository<Tarefa, UUID> {

}
