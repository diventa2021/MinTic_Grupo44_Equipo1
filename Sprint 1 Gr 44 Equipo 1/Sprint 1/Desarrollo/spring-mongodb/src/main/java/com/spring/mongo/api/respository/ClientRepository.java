package com.spring.mongo.api.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mongo.api.model.Client;

public interface ClientRepository extends MongoRepository<Client, Integer> {

}
