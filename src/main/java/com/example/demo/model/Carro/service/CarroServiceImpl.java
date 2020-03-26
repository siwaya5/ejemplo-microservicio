/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model.Carro.service;

import com.example.demo.model.Carro.model.Carro;
import com.example.demo.model.Carro.model.CarroRepository;
import com.example.demo.model.Carro.resource.CarroDTO;
import com.example.demo.utilidades.Constants;
import com.example.demo.utilidades.ObjectMapperUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.utilidades.ResponseUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Simon
 */
@Service
public class CarroServiceImpl implements CarroService {

    @Autowired
    private CarroRepository carroRepository;

    ResponseUtil responseUtil = new ResponseUtil();

    ObjectMapper objectMapper = ObjectMapperUtil.getInstanceObjectMapper();

    @Override
    public CarroDTO guardarCarro(CarroDTO carro) {
        Carro carroSave = objectMapper.convertValue(carro, Carro.class);
        return objectMapper.convertValue(carroRepository.save(carroSave), CarroDTO.class);
    }

    @Override
    public CarroDTO consultarCarroById(Long id) {
        return objectMapper.convertValue(carroRepository.findOne(id), CarroDTO.class);
    }

    @Override
    public ResponseUtil consultarAllCarro() {
        
        try {
            responseUtil.setMessage("");
            responseUtil.setTipo(Constants.CODE_OK);
            responseUtil.setJson(objectMapper.writeValueAsString(carroRepository.findAll()));
        } catch (JsonProcessingException ex) {
            Logger.getLogger(CarroServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return responseUtil;

    }

    @Override
    public void eliminarCarro(Long id) {
        carroRepository.delete(id);
    }

}
