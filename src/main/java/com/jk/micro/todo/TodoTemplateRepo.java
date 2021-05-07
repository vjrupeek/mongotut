package com.jk.micro.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.mongodb.client.result.DeleteResult;

@Repository
public class TodoTemplateRepo {

	@Autowired
	MongoTemplate mongoTemplate;
	
	public List<Todo> findAll() {
		return mongoTemplate.findAll(Todo.class);
	}
	
	public Todo findById(String id) {
		return mongoTemplate.findById(id, Todo.class);
	}
	
	public Todo save(Todo todo) {
		return mongoTemplate.save(todo);
	}
	
	public boolean delete(String id) {
		Todo todo = mongoTemplate.findById(id, Todo.class);
		DeleteResult result = mongoTemplate.remove(todo);
		return result.getDeletedCount() > 0;
	}
	
	
	
	
}
