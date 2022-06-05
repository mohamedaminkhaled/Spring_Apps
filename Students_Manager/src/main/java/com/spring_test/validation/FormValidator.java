package com.spring_test.validation;

import org.springframework.stereotype.Service;

@Service
public class FormValidator {
	
	public boolean validateName(String name, int length)
	{
		// check name length
		if(name.length() >= length) {
			return true;
		}else {
			return false;
		}
	}
}
