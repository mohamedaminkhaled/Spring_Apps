package com.sourcing.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sourcing.models.AmazonResults;
import com.sourcing.services.AmazonResultsService;

@RestController
//@RequiredArgsConstructor
@RequestMapping("/api/v1/amazon")
public class AmazonResultsController  {
	
	@Autowired
	private AmazonResultsService amazonResultsService;
	
	@GetMapping("/results/source/{source}")
	public List<AmazonResults> getAmazonResults(@PathVariable String source){
		try {
			String key = "SourceName";
			String value = source;
			List<AmazonResults> res = amazonResultsService.getResults(key, value);
			
			return res;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}











