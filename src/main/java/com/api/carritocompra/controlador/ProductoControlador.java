package com.api.carritocompra.controlador;

import com.api.carritocompra.models.entidad.Producto;
import com.api.carritocompra.models.servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@CrossOrigin(methods = { GET, POST, DELETE })
@RequestMapping("/producto")
public class ProductoControlador {

    @Autowired
    private ProductoServicio productoServicio;

   @GetMapping()
    private ResponseEntity <List<Producto>>  obtenerProductos(){
       return ResponseEntity.ok(this.productoServicio.obtenerProductos());
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    private void guardarProductos(@RequestBody Producto product){
        this.productoServicio.guardarProducto(product);
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<Void> eliminarProducto(@PathVariable int id){
        this.productoServicio.eliminarProducto(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
