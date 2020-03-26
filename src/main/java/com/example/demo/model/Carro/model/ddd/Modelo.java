/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model.Carro.model.ddd;
import com.example.demo.utilidades.ValueObject;
import org.apache.commons.lang3.Validate;
/**
 *
 * @author Simon
 */
public class Modelo implements ValueObject<Modelo>{

    private String modelo;

    public Modelo(String modelo) {
        Validate.notNull(modelo, "modelo no debe ser nulo");
        this.modelo = modelo;
    }
    
    @Override
    public boolean sameValueAs(Modelo other) {
        return other != null && this.modelo.equals(other.modelo);
    }
    
}
