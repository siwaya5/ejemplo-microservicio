/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model.Carro.model.ddd;

import com.example.demo.utilidades.ValueObject;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang3.Validate;

/**
 *
 * @author Simon
 */
@JsonDeserialize
public class Modelo  {

    private String modelo;

    public String Modelo() {
        return modelo;
    }

    public Modelo() {
    }

    public Modelo(String modelo) {
        Validate.notNull(modelo, "modelo no debe ser nulo");
        this.modelo = modelo;
    }

    @Override
    public int hashCode() {
        return modelo.hashCode();
    }


}
