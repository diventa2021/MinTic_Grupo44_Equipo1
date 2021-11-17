package com.spring.mongo.api.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mongo.api.model.User;

public interface UserRepository extends MongoRepository<User, Integer>{

}
