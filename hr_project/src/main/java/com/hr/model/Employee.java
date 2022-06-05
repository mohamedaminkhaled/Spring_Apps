package com.hr.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="Employees")
//@Setter
//@Getter
@NoArgsConstructor
//@AllArgsConstructor
//@ToString
@Data
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(notes = "database generated ID")
	private long id;
	@Column(name = "first_name")
	@ApiModelProperty(notes = "required field", required = true)
	@NonNull
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	private double salary;
	private String address;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "department_id")
	private Departments department;
			
	
}
