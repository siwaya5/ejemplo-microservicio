/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model.Carro.service;

import com.example.demo.model.Carro.resource.CarroDTO;
import com.example.demo.utilidades.ResponseUtil;

/**
 *
 * @author Simon
 */
public interface CarroService {
    
    public CarroDTO guardarCarro(CarroDTO carro);
    
    public CarroDTO consultarCarroById(Long id);
    
    public ResponseUtil consultarAllCarro();
    
    public void eliminarCarro(Long id);
    
}
