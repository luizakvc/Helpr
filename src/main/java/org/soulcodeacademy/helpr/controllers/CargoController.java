package org.soulcodeacademy.helpr.controllers;

import org.soulcodeacademy.helpr.domain.Cargo;
import org.soulcodeacademy.helpr.services.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CargoController { //Endpoint é o enderço que será acessado no back-end

    @GetMapping("/oi") // localhost:8080/oi retorna a String
    public String dizOla() {
        return "Retornando do back-end";
    }

    @GetMapping("/batata")
    public Integer valor() {
        return 1000;
    }

    @Autowired
    private CargoService cargoService;

    @GetMapping("/cargos")
    public List<Cargo> listar() {
        return this.cargoService.listar();
    }

    @GetMapping("/cargos/{idCargo}")
    public Cargo getCargo(@PathVariable Integer idCargo) {
        System.out.println(idCargo);
        return this.cargoService.getCargo(idCargo);
    }

    @PostMapping("/cargos") // podemos usar o mesmo Endpoint para verbos diferentes
    public Cargo salvar(@RequestBody Cargo cargo) {
        System.out.println(cargo.getNome());
        System.out.println(cargo.getDescricao());
        System.out.println(cargo.getSalario());
        Cargo salvo = this.cargoService.salvar(cargo);
        return salvo;
    }


}
