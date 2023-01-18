package com.employee.Exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(EmployeeNotFoundexception.class)
	public ResponseEntity<ErrorsR> handleConstructionNotFound(EmployeeNotFoundexception ex){
		ErrorsR er= new ErrorsR(new Date(),ex.getLocalizedMessage(),null);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(er);
	}

}
