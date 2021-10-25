package com.example.TodoItem.Service;

import java.util.List;

import com.example.TodoItem.Entity.TodoItem;

public interface TodoItemService {

	public TodoItem saveTodoItem(TodoItem todoGroup);
	
	public List<TodoItem> findAll();
	
	public TodoItem updateTodoItem(Long id,TodoItem todoGroup);
	
	public List<TodoItem> getTodoItemByList(Long id);
}
