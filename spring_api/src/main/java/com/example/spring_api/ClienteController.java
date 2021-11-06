/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.spring_api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author manuel
 */
@RestController
public class ClienteController {
    private final ClienteRepository repository;
    
    ClienteController( ClienteRepository repository){
        this.repository = repository;
    }
    
    // POST
    @PostMapping("/NutriNET/Cliente")
    Cliente newCliente(@RequestBody Cliente newcliente){
        return repository.save(newcliente);
    }
    
    /*
       GET /NutriNET/Cliente
    */
    @GetMapping("/NutriNET/Cliente/{id}")
    Cliente by_id(@PathVariable Integer id){
        return repository.findById(id)
                .orElseThrow(() -> new ClienteNotFound(id));
    }
    
    //PUT
    @PutMapping("/NutriNET/Cliente/{id}")
    Cliente remplaceCliente(@RequestBody Cliente newCliente, 
                                        @PathVariable Integer id){
        return repository.findById(id)
                .map(cliente -> {
                    cliente.setEdad(newCliente.getEdad());
                    cliente.setEstatura(newCliente.getEstatura());
                    cliente.setPeso(newCliente.getPeso());
                    cliente.setGeb(newCliente.getGeb());
                    return repository.save(cliente);
                })
                .orElseGet(() -> {
                    newCliente.setCliente_id(id);
                    return repository.save(newCliente);
                });
        
    }
    
}
