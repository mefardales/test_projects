/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.spring_api;

import java.util.function.Supplier;

/**
 *
 * @author manuel
 */
class ClienteNotFound extends RuntimeException {
  
    public ClienteNotFound(Integer id) {
         super("No se encontro el cliente " + id);
    }
    
    
}
