package com.example.demo.model.Producto.facade;

import com.example.demo.model.Producto.model.Producto;
import com.example.demo.model.Producto.resource.ProductoDTO;
import com.example.demo.model.Producto.service.ProductoServicio;
import com.example.demo.utilidades.ObjectMapperUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServicioFacadeImpl implements ProductoServicioFacade {

    @Autowired
    private ProductoServicio productoServicio;

    ObjectMapper objectMapper = ObjectMapperUtil.getInstanceObjectMapper();

    @Override
    public ProductoDTO guardarProducto(ProductoDTO product) {
        Producto prodSaved = objectMapper.convertValue(product, Producto.class);
        return objectMapper.convertValue(prodSaved, ProductoDTO.class);
    }

    @Override
    public ProductoDTO findById(Long id) {
        return objectMapper.convertValue(productoServicio.findById(id), ProductoDTO.class);
    }

    @Override
    public List<ProductoDTO> findAll() {
        try {
            String obj = objectMapper.writeValueAsString(productoServicio.findAll());

//            List<ProductoDTO> list = objectMapper.readValue(obj, new TypeReference<List<ProductoDTO>>);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(ProductoServicioFacadeImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProductoDTO editProducto(ProductoDTO product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
