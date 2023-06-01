package com.t3h.day1.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.t3h.day1.model.Error;

@ControllerAdvice
public class CommonExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Error> handleCommonException(Exception ex, WebRequest request) {
		
		Error error = new Error("Common error");
		
		ResponseEntity<Error> result = new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
		return result;
	}
}
