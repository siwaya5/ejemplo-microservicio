/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model.Carro.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.persistence.Embedded;

/**
 *
 * @author Simon
 */
public class CarroDTO {

    private Long id;

    private String numeroPuerta;
    private String numeroLlanta;
    private String marca;
    private String modelo;

    public CarroDTO() {
    }

    public CarroDTO(Long id, String numeroPuerta, String numeroLlanta, String marca, String modelo) {
        this.id = id;
        this.numeroPuerta = numeroPuerta;
        this.numeroLlanta = numeroLlanta;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroPuerta() {
        return numeroPuerta;
    }

    public void setNumeroPuerta(String numeroPuerta) {
        this.numeroPuerta = numeroPuerta;
    }

    public String getNumeroLlanta() {
        return numeroLlanta;
    }

    public void setNumeroLlanta(String numeroLlanta) {
        this.numeroLlanta = numeroLlanta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
