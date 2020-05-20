/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model.Producto.model;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Simon
 */
public interface ProductoRespository extends CrudRepository<Producto, Long> {

    Producto findByCodigo(String codigo);

    Producto findByNombre(String nombre);

    List<Producto> findByCantidad(int cantidad);
    
    Producto findByNombreAndCodigo(String nombre, String codigo);

}
