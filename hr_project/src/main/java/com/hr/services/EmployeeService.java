package com.hr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.error.RecordNotFoundException;
import com.hr.model.Employee;
import com.hr.reposatory.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {
	
//	@Autowired
//	EmployeeRepository employeeRepository;
	
	private final EmployeeRepository employeeRepository;
	
	public List<Employee> getDeptEmps(long deptId){
		return employeeRepository.findByDepartmentId(deptId);
	}
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	public Employee getEmpById(long id) {
		return employeeRepository.findById(id).orElseThrow(()-> new RecordNotFoundException("Employee id noe found: " + id));
	}
	
	public List<Employee> getEmpByFirstName(String firstName){
		return employeeRepository.findEmpByFirstName(firstName);
	}
	
	public List<Employee> getEmpSearch(String firstName, String lastName){
		return employeeRepository.empSearch(firstName, lastName);
	}
	
	public void addEmp(Employee newEmp) {
		employeeRepository.save(newEmp);
	}
	
	public void updateEmp(Employee newEmp) {
		employeeRepository.save(newEmp);
	}
	
	public void deleteEmp(long id) {
		employeeRepository.deleteById(id);
	}
	
}









