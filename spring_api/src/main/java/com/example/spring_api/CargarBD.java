/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.spring_api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 *
 * @author manuel
 */
@Configuration
public class CargarBD {
    
    private static final Logger log = 
            LoggerFactory.getLogger(CargarBD.class);
    
    @Bean
    CommandLineRunner initDatabese(ClienteRepository repository){
        return args -> {
            log.info("Cargando" + repository.save(
                    new Cliente()));
        };
    }
}
