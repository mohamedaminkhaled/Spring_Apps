package com.sourcing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sourcing.models.AmazonInput;
import com.sourcing.repository.AmazonInputRepo;

@Service
public class AmazonInputSearvice {
	
	@Autowired
	private AmazonInputRepo amazonInputRepo;
	
	public List<AmazonInput> findAllItems(){
		List<AmazonInput> res = amazonInputRepo.findAll();
		return res;
	}
	
	public List<AmazonInput> findByItemName(String name){
		List<AmazonInput> res = amazonInputRepo.findByItemName(name);
		return res;
	}
	
	public List<AmazonInput> findByStatus(int status){
		List<AmazonInput> res = amazonInputRepo.findByStatus(status);
		return res;
	}

}









