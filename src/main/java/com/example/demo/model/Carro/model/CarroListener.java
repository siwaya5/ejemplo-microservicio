/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model.Carro.model;

import com.example.demo.model.Carro.service.CarroService;
import com.example.demo.utilidades.ResponseUtil;
import javax.persistence.PrePersist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Simon
 */
@Component
public class CarroListener {

    static private CarroService carroService;

    @Autowired
    public void init(CarroService carroService) {
        CarroListener.carroService = carroService;
//        logger.info("Initializing with dependency [" + carroService + "]");
    }

    @PrePersist
    public void setCreationDate(Carro c) {

        c.setCompilacion(c.getNumeroPuerta() + ' ' + c.getMarca());
        ResponseUtil rr = carroService.consultarAllCarro();
//        carroService.consultarCarroById(this.id);
    }

}
