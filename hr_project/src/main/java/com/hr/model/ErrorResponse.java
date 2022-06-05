package com.hr.model;

import java.util.Date;
import java.util.List;

public class ErrorResponse {
	
	  //General error message about nature of error
	  private String message;
	  private String statusCode;
	  private Date time;
	 
	  //Specific errors in API request processing
	  private List<String> details;
		
		 public ErrorResponse(String message, String status, List<String> details) {
			    super();
			    this.message = message;
			    this.statusCode = status;
			    this.details = details;
			  }
	
}
