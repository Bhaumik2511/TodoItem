package com.example.TodoItem.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TodoItem.Dao.TodoItemDao;
import com.example.TodoItem.Entity.TodoItem;
import com.example.TodoItem.Service.TodoItemService;

@Service
public class TodoItemServiceImpl implements TodoItemService{

	@Autowired
	private TodoItemDao todoItemDao;
	@Override
	public TodoItem saveTodoItem(TodoItem todoItem) {
		return todoItemDao.save(todoItem);
	}

	@Override
	public List<TodoItem> findAll() {
		return todoItemDao.findAll();
	}

	@Override
	public TodoItem updateTodoItem(Long id, TodoItem newtodoItem) {
		return todoItemDao.findById(id).map(item -> {
			item.setDesciption(newtodoItem.getDesciption());
			return todoItemDao.save(item);
		}).orElseGet(() -> {
			newtodoItem.setItemId(id);
			return todoItemDao.save(newtodoItem);
		});
	}

	@Override
	public List<TodoItem> getTodoItemByList(Long id) {
		return todoItemDao.getListById(id);
	}

}
