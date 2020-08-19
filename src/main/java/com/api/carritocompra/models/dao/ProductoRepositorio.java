package com.api.carritocompra.models.dao;

import com.api.carritocompra.models.entidad.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepositorio extends CrudRepository<Producto,Integer> {

}
