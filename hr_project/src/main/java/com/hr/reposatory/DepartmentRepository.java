package com.hr.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hr.model.Departments;


@Repository
public interface DepartmentRepository extends JpaRepository<Departments, Long> {

}
