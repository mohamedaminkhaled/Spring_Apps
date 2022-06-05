package com.hr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hr.model.Departments;
import com.hr.services.DepartmentService;

@RestController
@RequestMapping("/api/v1")
public class DepartmentsController {
	
	@Autowired
	private DepartmentService deptService;
	
	@GetMapping("/departments")
	public List<Departments> getAllEmployees(){
		return deptService.getAllDeparts();
	}
	
	@GetMapping("/department/{id}")
	public Departments getDepartById(@PathVariable long id){
		return deptService.getDepartById(id);
	}
	
	@PostMapping("/department")
	public String addDepart(@RequestBody Departments newDepart) {
		
		deptService.addDepart(newDepart);
		
		return "saved successfully.";
		
	}
	
	@PutMapping("/department")
	public String updateDepart(@RequestBody Departments newDepart) {
		
		deptService.addDepart(newDepart);
		
		return "updated successfully.";
		
	}
	
	@DeleteMapping("/departments")
	public String deleteDepart(@RequestParam long id) {
		deptService.deleteDepart(id);
		return "deleted successfully.";
	}

}
