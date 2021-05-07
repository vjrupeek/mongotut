package com.jk.micro.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("todo")
public class TodoController {

	@Autowired
	private TodoService todoService;
	
	@GetMapping("/")
	public List<Todo> getAllTodos() {
		return todoService.findAll();
	}
	
	@GetMapping("/{id}")
	public Todo getTodo(@PathVariable String id) {
		return todoService.findTodoById(id);
	}
	
	@PostMapping("/")
	public Todo saveTodo(@RequestBody Todo todo) {
		return todoService.saveTodo(todo);
	}
	
	@PutMapping("/{id}")
	public Todo update(@PathVariable String id, @RequestBody Todo todo) {
		todo.setId(id);
		return todoService.saveTodo(todo);
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteTodo(@PathVariable String id) {
		return todoService.delete(id);
	}
	
	
	
}
