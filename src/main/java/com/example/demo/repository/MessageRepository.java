package com.example.demo.repository;

import com.example.demo.models.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface MessageRepository extends MongoRepository<Message, String> {

}
