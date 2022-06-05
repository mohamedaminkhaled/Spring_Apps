package com.sourcing.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sourcing.models.AmazonInput;
import com.sourcing.services.AmazonInputSearvice;

@RestController
@RequestMapping("/api/v1/amazoninput")
public class AmazonInputController {
	
	@Autowired
	private AmazonInputSearvice amazonInputSearvice;
	
	@GetMapping("/items")
	public List<AmazonInput> getItemByName(){
		try {
			List<AmazonInput> res = amazonInputSearvice.findAllItems();
			return res;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("/items/name/{name}")
	public List<AmazonInput> getItemByName(@PathVariable String name){
		List<AmazonInput> res = amazonInputSearvice.findByItemName(name);
		return res;
	}
	
	@GetMapping("/items/status/{status}")
	public List<AmazonInput> findByStatus(@PathVariable int status){
		List<AmazonInput> res = amazonInputSearvice.findByStatus(status);
		return res;
	}

}








