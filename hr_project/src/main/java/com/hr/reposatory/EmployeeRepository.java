package com.hr.reposatory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hr.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	public List<Employee> findEmpByFirstName(String firstName);
	
	@Query("select emp from Employee emp where emp.firstName=:firstNameBind and emp.lastName=:lastNameBind")
	public List<Employee> empSearch(@Param("firstName") String firstName, 
									@Param("lastName") String lastName);
	
	public List<Employee> findByDepartmentId(long departmentId);
	
}
