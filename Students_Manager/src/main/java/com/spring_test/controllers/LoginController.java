package com.spring_test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring_test.services.LoginService;

@Controller
@SessionAttributes("email")
public class LoginController {
	
	@Autowired
	LoginService loginSearvice;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
//	@ResponseBody
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String getLoginInfo(
			@RequestParam String email, 
			@RequestParam String pswd,
			ModelMap model) {
		
//		LoginService loginSearvice = new LoginService();
				
		if(!loginSearvice.checkUserValidation(email, pswd)) {
			model.put("errMsg", "Username or password is incorrect!");
			return "login";
		}
		
		model.put("email", email);
		return "home";
	}
	
	@RequestMapping(value="/home")
	public String HomePage() {
		return "home";
	}
}
