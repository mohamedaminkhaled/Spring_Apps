package com.hr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hr.model.Employee;
import com.hr.services.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/api/v1")

@Api(value = "employee", description = "operations for employee service")
public class EmployeeController {
	
	@Value("${spring.application.name}")
	String appName;
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/appName")
	public String getAppName(){
		return appName;
	}
	
	@GetMapping("department/{deptId}/employees")
	@ApiOperation(value = "view a list of available employees", response = Employee.class)
	public List<Employee> getDeptEmps(@PathVariable long deptId){
		return empService.getDeptEmps(deptId);
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return empService.getAllEmployees();
	}
	
	@GetMapping("/employee")
	public Employee getEmpById(@RequestParam long id){
		return empService.getEmpById(id);
	}
	
	@GetMapping("/employees/{firstName}")
	public List<Employee> getEmpByFirstName(@PathVariable String firstName){
		return empService.getEmpByFirstName(firstName);
	}
	
	@GetMapping("/employeeSearch")
	public List<Employee> getEmpSearch(@RequestParam String firstName, @RequestParam String lastName){
		return empService.getEmpSearch(firstName, lastName);
	}
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> addEmp(@Validated @RequestBody Employee newEmp) {
		
		empService.addEmp(newEmp);
		
		return new ResponseEntity<Employee>(newEmp, HttpStatus.OK);	
		
	}
	
	@PutMapping("/employee")
	public ResponseEntity<Employee> updateEmp(@RequestBody Employee newEmp) {
		
		empService.addEmp(newEmp);
		
		return new ResponseEntity<Employee>(newEmp, HttpStatus.OK);	
		
	}
	
	@DeleteMapping("/employee")
	public String deleteEmp(@RequestParam long id) {
		empService.deleteEmp(id);
		return "deleted successfully.";
	}

}











