package com.spring.mongo.api.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mongo.api.model.Ventas;

public interface VentasRepository extends MongoRepository<Ventas, Integer>{

}
