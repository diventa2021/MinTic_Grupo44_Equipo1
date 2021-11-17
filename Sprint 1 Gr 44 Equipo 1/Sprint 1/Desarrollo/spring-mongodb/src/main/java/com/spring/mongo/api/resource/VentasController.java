package com.spring.mongo.api.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mongo.api.model.Ventas;
import com.spring.mongo.api.respository.VentasRepository;

@RestController
public class VentasController {
	
	@Autowired
	private VentasRepository repositorio;
	
	@PostMapping("/addVenta")
	public String saveVentas(@RequestBody Ventas venta) {
	repositorio.save(venta);
	return "Se agregó una venta con el codigo: "+ venta.getId();
	}
	
	@GetMapping("/finAllVentas")
	public List<Ventas> listarVentas(){
	return repositorio.findAll();
	}
	
	@GetMapping("/finAllVentas/{id}")
	public Optional<Ventas> listarVentas(@PathVariable int id){
	return repositorio.findById(id);
	}
	
	@DeleteMapping("/deleteVentas/{id}")
	public String deleteVentas(@PathVariable int id){
	repositorio.findById(id);
	return "Venta eliminada con el id: "+id;
	}
	
	
}
