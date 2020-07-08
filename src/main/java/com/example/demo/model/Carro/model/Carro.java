/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model.Carro.model;

import com.example.demo.model.Carro.model.ddd.Modelo;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.PrePersist;
import javax.persistence.Table;
/**
 *
 * @author Simon
 */
@Entity
@Table(name = "carro")
@EntityListeners({CarroListener.class})
public class Carro {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Id
    @Column(columnDefinition = "serial")
    private Long id;

    private String numeroPuerta;
    private String numeroLlanta;
    private String marca;
    @Embedded
    @JsonUnwrapped
    private Modelo modelo;

    private String compilacion;



    public Carro() {
    }

    public Carro(Long id, String numeroPuerta, String numeroLlanta, String marca, Modelo modelo) {
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

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getCompilacion() {
        return compilacion;
    }

    public void setCompilacion(String compilacion) {
        this.compilacion = compilacion;
    }

}
