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

import com.spring.mongo.api.model.Client;
import com.spring.mongo.api.respository.ClientRepository;

@RestController // Anotacion que es un controlador
public class ClientControlller {
	
	// Creamos un objeto de tipo repository de cliente
	
	@Autowired
	private ClientRepository repositorio;
	
	
	@PostMapping("/addClient")
	public String saveCliente(@RequestBody Client client) {
		repositorio.save(client);
		return "Cliente Guardado con el Id: "+ client.getId();
	}
	
	@GetMapping("/listClient")
	public List<Client> ListClient(){ // No se reciben paremetros porq lista todos lo clientes
		return repositorio.findAll();
	}
	
	@GetMapping("/listClient/{id}")
	public Optional<Client> ListClient(@PathVariable int id){
		return repositorio.findById(id);
	}
	
	@DeleteMapping("/deleteClient/{id}")
	public String deleteClient(@PathVariable int id) {
		repositorio.deleteById(id);
		return "Cliente eliminado con el Id: "+ id;
	}
	
}
