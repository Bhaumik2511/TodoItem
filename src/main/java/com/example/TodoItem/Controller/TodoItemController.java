package com.example.TodoItem.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.TodoItem.Entity.TodoItem;
import com.example.TodoItem.Service.TodoItemService;

@RestController
public class TodoItemController {

	@Autowired
	private TodoItemService service;
	
	@PostMapping("/create-todoItem")
	public ResponseEntity<TodoItem> saveTodoItem(@RequestHeader("groupId") Long groupId,@RequestBody TodoItem todoItem) {
		todoItem.setGroup_id(groupId);
		TodoItem obj = service.saveTodoItem(todoItem);
		 return new ResponseEntity<>(obj,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/update-todoItem/{itemId}")
	public ResponseEntity<TodoItem> updateTodoGroup(@PathVariable("itemId") Long id,@RequestBody TodoItem todoGroup) {
	
		return new ResponseEntity<>(service.updateTodoItem(id,todoGroup),HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/todoItems")
	public ResponseEntity<List<TodoItem>> getTodoItems() {
		return new ResponseEntity<>(service.findAll(),HttpStatus.OK);
		
	}
	
	@GetMapping("/todoItems/{groupId}")
	public ResponseEntity<List<TodoItem>> getTodoItemsById(@PathVariable("groupId") Long id) {
		return new ResponseEntity<>(service.getTodoItemByList(id),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete-group/{itemId}")
	public void deleteTodoItem(@PathVariable("itemId") Long itemId) {
		service.deleteById(itemId);
	}
	
	
}
