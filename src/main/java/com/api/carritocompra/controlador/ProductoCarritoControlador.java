package com.api.carritocompra.controlador;


import com.api.carritocompra.models.entidad.ProductoCarrito;
import com.api.carritocompra.models.servicio.ProductoCarritoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@CrossOrigin(methods = { GET, POST, DELETE, PUT })
@RequestMapping("/productoCarrito")
public class ProductoCarritoControlador {

    @Autowired
    private ProductoCarritoServicio productoCarritoServicio;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    private void guardarProductoCarrito(@RequestBody ProductoCarrito productoCarrito){
      this.productoCarritoServicio.guardarProductoCarritoCompra(productoCarrito);
    }

    @GetMapping()
    private ResponseEntity<List<ProductoCarrito>> obtenerPorductosCarrito(){
        return ResponseEntity.ok(this.productoCarritoServicio.obtenerProductosCarritoCompra());
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<Void> eliminarProductoCarrito(@PathVariable int id){
        this.productoCarritoServicio.eliminarProductoCarritoCompra(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping()
    private void actualizarEstado(@RequestBody ProductoCarrito productoCarrito){
        this.productoCarritoServicio.actualizarEstado(productoCarrito);
    }
}
