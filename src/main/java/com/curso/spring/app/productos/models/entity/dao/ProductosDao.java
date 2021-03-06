package com.curso.spring.app.productos.models.entity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.spring.app.productos.models.entity.Producto;

@Repository
public interface ProductosDao extends JpaRepository<Producto, Long> {

}
