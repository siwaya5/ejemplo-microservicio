package com.example.demo.model.Producto.facade;

import com.example.demo.model.Producto.resource.ProductoDTO;
import java.util.List;

public interface ProductoServicioFacade {

    ProductoDTO guardarProducto(ProductoDTO product);

    ProductoDTO findById(Long id);

    List<ProductoDTO> findAll();

    void deleteById(Long id);

    ProductoDTO editProducto(ProductoDTO product);

}
