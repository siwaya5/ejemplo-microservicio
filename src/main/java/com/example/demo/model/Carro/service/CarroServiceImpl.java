/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model.Carro.service;

import com.example.demo.model.Carro.model.Carro;
import com.example.demo.model.Carro.model.CarroRepository;
import com.example.demo.utilidades.ObjectMapperUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Simon
 */
@Service
public class CarroServiceImpl implements CarroService {

    @Autowired
    private CarroRepository carroRepository;

    ObjectMapper objectMapper = ObjectMapperUtil.getInstanceObjectMapper();

    @Override
    public Carro guardarCarro(Carro carro) {
        return carroRepository.save(carro);
    }

    @Override
    public Carro consultarCarroById(Long id) {
        return carroRepository.findOne(id);
    }

    @Override
    public List<Carro> consultarAllCarro() {
        return (List<Carro>) carroRepository.findAll();
    }

    @Override
    public void eliminarCarro(Long id) {
        carroRepository.delete(id);
    }

}
