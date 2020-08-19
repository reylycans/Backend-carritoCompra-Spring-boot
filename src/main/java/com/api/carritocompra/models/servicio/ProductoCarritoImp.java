package com.api.carritocompra.models.servicio;

import com.api.carritocompra.models.dao.ProductoCarritoRepositorio;
import com.api.carritocompra.models.dao.ProductoRepositorio;
import com.api.carritocompra.models.entidad.ProductoCarrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoCarritoImp implements ProductoCarritoServicio {

    @Autowired
    private ProductoCarritoRepositorio productoCarritoRepositorio;

    @Override
    public void guardarProductoCarritoCompra(ProductoCarrito productCart) {
        this.productoCarritoRepositorio.save(productCart);
    }

    @Override
    public void eliminarProductoCarritoCompra(int id) {
       this.productoCarritoRepositorio.deleteById(id);
    }

    @Override
    public List<ProductoCarrito> obtenerProductosCarritoCompra() {
        List<ProductoCarrito> productoCarrito = new ArrayList<>();
        this.productoCarritoRepositorio.findAll().forEach(productoCarrito::add);
        return productoCarrito;
    }

    @Override
    public ProductoCarrito obtenerProductoCarritoPorId(int id) {
        return productoCarritoRepositorio.findById(id).orElse(null);
    }

    @Override
    public void actualizarEstado(ProductoCarrito productCart) {
        ProductoCarrito productoCarrito = this.obtenerProductoCarritoPorId(productCart.getId());
        productoCarrito.setCarrito(productCart.getCarrito());
        this.productoCarritoRepositorio.save(productoCarrito);
    }

}
