package com.course.registration.exceptions.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.course.registration.exceptions.DataNotFoundException;

@ControllerAdvice
public class GlobalAdvicer {

	
//	 @ExceptionHandler(value = {DataNotFoundException.class})
//	  public ResponseEntity<> resourceNotFoundException(DataNotFoundException ex, WebRequest request) {
//	    ErrorMessage message = new ErrorMessage(
//	        status,
//	        date,
//	        ex.getMessage(),
//	        description);
//	    
//	    return new ResponseEntity<ErrorMessage>(message, HttpStatus.NOT_FOUND);
//	  }
}
