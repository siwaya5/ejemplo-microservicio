/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model.Producto.service;

import com.example.demo.model.Producto.model.Producto;
import com.example.demo.model.Producto.model.ProductoRespository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Simon
 */
@Service
public class ProductoServicioImpl implements ProductoServicio {

    @Autowired
    private ProductoRespository productoRespository;

    @Override
    public Producto guardarProducto(Producto product) {
        return productoRespository.save(product);
    }

    @Override
    public Producto findById(Long id) {
        Optional<Producto> producto = productoRespository.findById(id);
        if (producto.isPresent()) {
            return producto.get();
        }
        return new Producto();
    }

    @Override
    public List<Producto> findAll() {
        return (List<Producto>) productoRespository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        productoRespository.deleteById(id);
    }

    @Override
    public Producto editProducto(Producto product) {
        return productoRespository.save(product);
    }

}
