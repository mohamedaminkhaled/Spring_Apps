package com.spring_test.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionContoller {
	
	@ExceptionHandler(value=Exception.class)
	public String handleException(HttpServletRequest request, Exception ex) {
		System.out.println("Request: " + request.getRequestURL() + "Error: " + ex);
		return "error";
	}

}
