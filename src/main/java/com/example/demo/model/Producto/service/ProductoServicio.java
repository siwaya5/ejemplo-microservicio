/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model.Producto.service;

import com.example.demo.model.Producto.model.Producto;
import java.util.List;

/**
 *
 * @author Simon
 */
public interface ProductoServicio {

    Producto guardarProducto(Producto product);
    
    Producto findById(Long id);
    
    List<Producto> findAll();
    
    void deleteById(Long id);
    
    Producto editProducto(Producto product);

}
