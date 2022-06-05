package com.hr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.model.Departments;
import com.hr.model.Employee;
import com.hr.reposatory.DepartmentRepository;
import com.hr.reposatory.EmployeeRepository;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	public List<Departments> getAllDeparts(){
		return departmentRepository.findAll();
	}
	
	public Departments getDepartById(long id) {
		return departmentRepository.findById(id).orElseThrow(null);
	}
	
//	public List<Departments> getEmpByFirstName(String firstName){
//		return departmentRepository.findEmpByFirstName(firstName);
//	}
	
//	public List<Departments> getEmpSearch(String firstName, String lastName){
//		return departmentRepository.empSearch(firstName, lastName);
//	}
	
	public void addDepart(Departments newDepart) {
		departmentRepository.save(newDepart);
	}
	
	public void updateDepart(Departments newDepart) {
		departmentRepository.save(newDepart);
	}
	
	public void deleteDepart(long id) {
		departmentRepository.deleteById(id);
	}

}
