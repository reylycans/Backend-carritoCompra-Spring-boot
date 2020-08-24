package com.api.carritocompra.models.entidad;

import lombok.Data;

import javax.persistence.*;



@Entity
@Data
@Table(name = "product_Cart")
public class ProductoCarrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product", referencedColumnName = "id")
    private Producto  producto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cart", referencedColumnName = "id")

    private Carrito carrito;

    private int cantidad;

}
