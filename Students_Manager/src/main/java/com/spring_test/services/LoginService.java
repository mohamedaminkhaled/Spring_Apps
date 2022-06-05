package com.spring_test.services;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean checkUserValidation(String userName, String password) {
		if(userName.equals("mohamedamin.tech@gmail.com") && password.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
}
