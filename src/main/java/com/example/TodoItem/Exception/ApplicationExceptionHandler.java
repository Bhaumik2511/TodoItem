package com.example.TodoItem.Exception;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApplicationExceptionHandler {
	
	private static final String EMPTYDATA_MESSAGE ="Not record found for requested group id.";
	
    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<TodoItemException> handleEmptyResultSetException(Exception e){
    	TodoItemException todoGroupException = new TodoItemException(204, EMPTYDATA_MESSAGE);
        return ResponseEntity.status(HttpStatus.NO_CONTENT)
                .body(todoGroupException);
    }
    
   
}
