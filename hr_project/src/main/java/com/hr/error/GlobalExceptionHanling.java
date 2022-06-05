package com.hr.error;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.hr.model.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHanling {
	
	@ExceptionHandler(Exception.class)
	  public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
	    List<String> details = new ArrayList<>();
	    details.add(ex.getLocalizedMessage());
	    ErrorResponse error = new ErrorResponse("Server Error", HttpStatus.INTERNAL_SERVER_ERROR.toString(), details);
	    return new ResponseEntity(error, HttpStatus.INTERNAL_SERVER_ERROR);
	  }
	
	@ExceptionHandler(RecordNotFoundException.class)
	  public final ResponseEntity<Object> handleUserNotFoundException(RecordNotFoundException ex, WebRequest request) {
	    List<String> details = new ArrayList<>();
	    details.add(ex.getLocalizedMessage());
	    ErrorResponse error = new ErrorResponse("Record Not Found", HttpStatus.NOT_FOUND.toString(), details);
	    return new ResponseEntity(error, HttpStatus.NOT_FOUND);
	  }

}













