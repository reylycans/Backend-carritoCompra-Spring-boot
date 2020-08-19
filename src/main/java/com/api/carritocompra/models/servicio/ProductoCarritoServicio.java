package com.api.carritocompra.models.servicio;

import com.api.carritocompra.models.entidad.Producto;
import com.api.carritocompra.models.entidad.ProductoCarrito;

import java.util.List;


public interface ProductoCarritoServicio {

    void guardarProductoCarritoCompra (ProductoCarrito productCart);
    void eliminarProductoCarritoCompra(int id);
    List<ProductoCarrito> obtenerProductosCarritoCompra();
    ProductoCarrito obtenerProductoCarritoPorId(int id);
    void actualizarEstado(ProductoCarrito productCart);
}
