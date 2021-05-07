package com.jk.micro.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

	@Autowired
	private TodoTemplateRepo todoRepository;
	//private TodoRepository todoRepository;
	
	
	public List<Todo> findAll() {
		return todoRepository.findAll();
	}
	
	public Todo findTodoById(String id) {
		return todoRepository.findById(id);
	}
	
	public Todo saveTodo(Todo todo) {
		return todoRepository.save(todo);
	}
	
	
	
	public boolean delete(String id) {
		return todoRepository.delete(id);
	}
}
