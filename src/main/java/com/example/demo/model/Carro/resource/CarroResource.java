/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model.Carro.resource;

import com.example.demo.model.Carro.model.Carro;
import com.example.demo.model.Carro.service.CarroService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.utilidades.ResponseUtil;

/**
 *
 * @author Simon
 */
@RestController
@RequestMapping("/Carro")
public class CarroResource {

    @Autowired
    private CarroService carroService;

    @RequestMapping(value = "getAllCarro", method = RequestMethod.GET)
    public ResponseUtil findAllCarro() {
        return carroService.consultarAllCarro();
    }

    @RequestMapping(value = "getCarroById/{id}", method = RequestMethod.GET)
    public CarroDTO findCarroById(@PathVariable Long id) {
        return carroService.consultarCarroById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void guardarRol(@RequestBody @Valid CarroDTO carro) {
        carroService.guardarCarro(carro);
    }

}
