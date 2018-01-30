/*package com.incedo.model.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler {
 
    @ExceptionHandler(RuntimeException.class)
    protected ResponseEntity<String> handleConflict(RuntimeException ex) {
    	ex.printStackTrace();
    	System.out.println("I am here");
        String bodyOfResponse = "There is some issue on server";
        return new ResponseEntity<String>(bodyOfResponse, HttpStatus.CONFLICT);
    }
}*/