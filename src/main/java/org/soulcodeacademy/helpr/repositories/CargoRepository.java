package org.soulcodeacademy.helpr.repositories;

import org.soulcodeacademy.helpr.domain.Cargo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Repository é um recurso que permite manupular a entidade no banco de dados
@Repository
public interface CargoRepository extends CrudRepository<Cargo, Integer> {
}
