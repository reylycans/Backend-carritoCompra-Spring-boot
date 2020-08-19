package com.api.carritocompra.models.servicio;

import com.api.carritocompra.models.entidad.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductoServicio {

     void guardarProducto(Producto product);
     List<Producto> obtenerProductos();
     void eliminarProducto(int idProducto);

}
