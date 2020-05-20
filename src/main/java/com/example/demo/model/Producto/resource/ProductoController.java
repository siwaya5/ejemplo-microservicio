/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model.Producto.resource;

import com.example.demo.model.Producto.model.Producto;
import com.example.demo.model.Producto.service.ProductoServicio;
import com.example.demo.utilidades.ObjectMapperUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Simon
 */
@RestController
@RequestMapping("/Producto")
public class ProductoController {

    @Autowired
    private ProductoServicio productoServicio;

    ObjectMapper objectMapper = ObjectMapperUtil.getInstanceObjectMapper();

    //"localhost:8080/api/Producto/findById/1"
    @RequestMapping(value = "getAllProductos", method = RequestMethod.GET)
    public List<Producto> findAllProducto() {
        return productoServicio.findAll();
    }
//
//    @RequestMapping(value = "getCarroById/{id}", method = RequestMethod.GET)
//    public CarroDTO findCarroById(@PathVariable Long id) {
//        return carroService.consultarCarroById(id);
//    }
//

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public ProductoDTO guardarCarro(@RequestBody @Valid ProductoDTO productoDTO) {
        Producto producto = productoServicio.guardarProducto(objectMapper.convertValue(productoDTO, Producto.class));
        return objectMapper.convertValue(producto, ProductoDTO.class);
    }

}
