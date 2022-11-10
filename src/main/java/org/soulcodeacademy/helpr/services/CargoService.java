package org.soulcodeacademy.helpr.services;

import org.soulcodeacademy.helpr.domain.Cargo;
import org.soulcodeacademy.helpr.repositories.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class CargoService {
    @Autowired
    private CargoRepository cargoRepository;

    // Listar todos
    public List<Cargo> listar() { // retorna os dados da tabela em forma de lista
        return this.cargoRepository.findAll();
    }// SELECT * FROM cargo

    //Lista um pelo ID
    public Cargo getCargo(Integer idCargo) {
        Optional<Cargo> cargo = this.cargoRepository.findById(idCargo);
        if(cargo.isEmpty()) { // caso o id seja inexistente
            throw new RuntimeException("O cargo não foi encotrado"); // Causa um erro com a mensagem
        } else {
            return cargo.get();
        }
    } // SELECT * FROM cargo WHERE idCargo =

    // SALVAR
    public Cargo salvar(Cargo novoCargo) {
        novoCargo.setIdCargo(null); // limpa o campo id para não substituir
        Cargo cargoSalvo = this.cargoRepository.save(novoCargo);
        return cargoSalvo;
    }


}
