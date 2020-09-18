package com.curso.spring.app.productos.models.entity.service;

import java.util.List;

import com.curso.spring.app.productos.models.entity.Producto;

public interface IProcuctoService {
	
	public List<Producto> findAll();
	public Producto findById(Long id);

}
