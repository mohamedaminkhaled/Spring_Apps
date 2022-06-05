package com.sourcing.sql_controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sourcing.sql_models.CrawlingResults;
import com.sourcing.sql_services.CrawlingResultsService;


@RestController
@RequestMapping("/api/v1/crawling_data")
public class CrawlingResultsController {
	
	@Autowired
    private CrawlingResultsService cs;
     
	@PostMapping("/add_data")
    public void addAllData() {
    	
        try {
        	 String filePath = "D:/Company_V1/Exports/Amazon/Amazon_Laptop_Results_New.csv";
			 cs.saveCrawlingResults(filePath);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	
	@PostMapping("/add_one")
	public ResponseEntity<CrawlingResults> addOneRow(@RequestBody CrawlingResults newItem) {
		cs.addItem(newItem);
		return new ResponseEntity<CrawlingResults>(newItem, HttpStatus.OK);
	}
	
	@GetMapping("/results/{item}")
	public List<CrawlingResults> getEmpByFirstName(@PathVariable String item){
		return cs.getByItem(item);
	}

}












