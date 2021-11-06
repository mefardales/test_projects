/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.spring_api;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author manuel
 */
interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
}
