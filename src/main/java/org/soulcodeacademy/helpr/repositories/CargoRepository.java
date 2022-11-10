package org.soulcodeacademy.helpr.repositories;

import org.soulcodeacademy.helpr.domain.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Repository é um recurso que permite manupular a entidade no banco de dados
@Repository
public interface CargoRepository extends JpaRepository<Cargo, Integer> {
}

//CrudRepository contém as operações básicas de um banco de dados
//JpaRepository tem mais funcionalidades pra tratar a entidade
