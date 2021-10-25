package com.example.TodoItem.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.TodoItem.Entity.TodoItem;

public interface TodoItemDao extends JpaRepository<TodoItem, Long> {
	
	 @Query("select t from TodoItem t where t.group_id = :Id")
	 List<TodoItem> getListById(@Param("Id") Long Id);

}
