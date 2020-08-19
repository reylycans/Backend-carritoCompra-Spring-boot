package com.api.carritocompra.models.servicio;

import com.api.carritocompra.models.dao.ProductoRepositorio;
import com.api.carritocompra.models.entidad.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoImp implements ProductoServicio {

    @Autowired
    private ProductoRepositorio productDao;

    @Override
    public void guardarProducto(Producto product) {
        this.productDao.save(product);
    }

    @Override
    public List<Producto> obtenerProductos() {
        List<Producto> products = new ArrayList<>();
        this.productDao.findAll().forEach(products::add);
        return products;
    }

    @Override
    public void eliminarProducto(int idProducto) {
        this.productDao.deleteById(idProducto);
    }
}
