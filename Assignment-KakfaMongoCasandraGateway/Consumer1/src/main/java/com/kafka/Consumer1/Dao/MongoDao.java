package com.kafka.Consumer1.Dao;

import com.kafka.Consumer1.Document.MongoDoc;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoDao extends MongoRepository<MongoDoc, Integer> {
}
