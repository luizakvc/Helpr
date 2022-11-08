package org.soulcodeacademy.helpr.services;

import org.soulcodeacademy.helpr.domain.Cargo;
import org.soulcodeacademy.helpr.repositories.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Service indica que a Classe será operada pelo Spring
@Service
public class PopulateService { // Objetivo dessa classe é inserir no banco  dados ficticios

    @Autowired // Injeta o objeto direto na classe
    private CargoRepository cargoRepository;

    public void populate() {
        Cargo c1 = new Cargo(null, "Diretor geral", "Gerencia a empresa", 30000.00);
        Cargo c2 = new Cargo(null, "Diretor de setor", "Gerencia de setor", 18000.00);
        Cargo c3 = new Cargo(null, "Tecnico geral", "Responsavel por chamados", 10000.00);
        this.cargoRepository.save(c1); // salva no banco = INSERT INTO
        this.cargoRepository.save(c2);
        this.cargoRepository.save(c3);
    }
}
