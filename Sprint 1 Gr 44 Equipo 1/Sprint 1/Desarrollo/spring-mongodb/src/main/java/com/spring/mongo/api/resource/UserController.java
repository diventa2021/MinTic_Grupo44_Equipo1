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

import com.spring.mongo.api.model.User;
import com.spring.mongo.api.respository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository repositorio;
	
	// Metodo para agregar un usuario
	@PostMapping("/addUser")
	public String saveUser(@RequestBody User usuario) {
		repositorio.save(usuario);
		return "Usuario creado con id: "+ usuario.getId();
	}
	
	// Metodo para listar usuarios
	@GetMapping("/listUser")
	public List<User> fynAllUser(){
		return repositorio.findAll();
		
	}
	
	// Metodo para listar un usuario por id
	@GetMapping("/listUser/{id}") 
	public Optional<User> fynAllUser(@PathVariable int id){
		return repositorio.findById(id);
		
	}
	
	// Metodo para eliminar un usuario
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable int id) {
		repositorio.deleteById(id);
		return "Usuario eliminado con el Id: "+ id;
	}
	
	
}
