package com.curso.spring.app.productos.models.entity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.curso.spring.app.productos.models.entity.Producto;
import com.curso.spring.app.productos.models.entity.dao.ProductoDao;

public class ProductoServiceImpl implements IProcuctoService{

	@Autowired
	ProductoDao productoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {		
		return productoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {		
		return productoDao.findById(id).orElse(null);
	}

}
