package com.api.carritocompra.models.entidad;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "product")
public class Producto {

    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String sku;

    @Column(nullable = false)
    private String descripcion;


}
