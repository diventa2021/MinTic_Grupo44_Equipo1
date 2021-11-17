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

import com.spring.mongo.api.model.Consolidated;
import com.spring.mongo.api.respository.ConsolidatedRepository;

@RestController // Anotacion que es un controlador
public class ConsolidatedControlller {
	
	// Creamos un objeto de tipo repository de cliente
	
	@Autowired
	private ConsolidatedRepository repositorio;
	
	
	@PostMapping("/addConsolidated")
	public String saveConsolidated(@RequestBody Consolidated consolidado) {
		repositorio.save(consolidado);
		return "Consolidado Guardado con el Id: "+ consolidado.getId();
	}
	
	@GetMapping("/listConsolidated")
	public List<Consolidated> ListClient(){ // No se reciben paremetros porq lista todos lo clientes
		return repositorio.findAll();
	}
	
	@GetMapping("/listConsolidated/{id}")
	public Optional<Consolidated> ListConsolidated(@PathVariable int id){
		return repositorio.findById(id);
	}
	
	@DeleteMapping("/deleteConsolidated/{id}")
	public String deleteConsolidated(@PathVariable int id) {
		repositorio.deleteById(id);
		return "Consolidado eliminado con el Id: "+ id;
	}
}
