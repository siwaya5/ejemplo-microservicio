/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model.Carro.service;

import com.example.demo.model.Carro.model.Carro;
import java.util.List;

/**
 *
 * @author Simon
 */
public interface CarroService {
    
    public Carro guardarCarro(Carro carro);
    
    public Carro consultarCarroById(Long id);
    
    public List<Carro> consultarAllCarro();
    
    public void eliminarCarro(Long id);
    
}
