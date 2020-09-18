package com.curso.spring.app.productos.models.entity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.curso.spring.app.productos.models.entity.Producto;
import com.curso.spring.app.productos.models.entity.service.IProcuctoService;

@RestController
public class ProductoController {
	
	@Autowired
	private IProcuctoService productoService;
	
	@GetMapping("/listar")
	public List<Producto> listar(){
		return productoService.findAll();
	}
	@GetMapping("ver/{id}")
	public Producto listaById(@PathVariable Long id) {
		return productoService.findById(id);
	}

}
