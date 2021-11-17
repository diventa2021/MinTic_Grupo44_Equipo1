package com.spring.mongo.api.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.spring.mongo.api.model.Consolidated;

public interface ConsolidatedRepository extends MongoRepository<Consolidated, Integer> {

}
