package com.sourcing.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sourcing.models.AmazonSummaryModel;
import com.sourcing.services.SummaryService;

@RestController
@RequestMapping("/api/v1/amazon")
public class SummaryController {
	
	@Autowired
	private SummaryService summarryService;
	
	@GetMapping("/summarry")
	public List<AmazonSummaryModel> getEngineSummarry(){
		List<AmazonSummaryModel> res = summarryService.getSummarry();
		
		return res;
	}

}








