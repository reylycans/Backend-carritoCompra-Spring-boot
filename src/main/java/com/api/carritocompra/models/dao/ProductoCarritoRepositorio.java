package com.api.carritocompra.models.dao;

import com.api.carritocompra.models.entidad.ProductoCarrito;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ProductoCarritoRepositorio extends CrudRepository<ProductoCarrito,Integer> {

}
