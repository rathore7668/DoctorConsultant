package com.me.controller;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.me.exception.DoctorNotFoundException;


@ControllerAdvice
public class DoctorExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value 
		      = {DoctorNotFoundException.class})
		    protected ResponseEntity<Object> handleConflict(
		      RuntimeException ex, WebRequest request) {
		        String bodyOfResponse = "Doctor with this age not found";
           return handleExceptionInternal(ex, bodyOfResponse, 
		          new HttpHeaders(), HttpStatus.NOT_FOUND, request);
		    }
	
			/*
			 * @ResponseStatus(HttpStatus.BAD_REQUEST)
			 * 
			 * @ExceptionHandler(MethodArgumentNotValidException.class) public Map<String,
			 * String> handleValidationExceptions( MethodArgumentNotValidException ex) {
			 * Map<String, String> errors = new HashMap<>();
			 * ex.getBindingResult().getAllErrors().forEach(error -> { String fieldName =
			 * ((FieldError) error).getField(); String errorMessage =
			 * error.getDefaultMessage(); errors.put(fieldName, errorMessage); }); return
			 * errors; }
			 */
}