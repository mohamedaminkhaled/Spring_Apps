package com.spring_test.models;

import java.util.Objects;

public class Student {
	
	private int id;
	private String name;
	private String date;
	private boolean isActive;
	
	
	public Student(int id, String name, String date, boolean isActive) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.isActive = isActive;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public boolean getIsActive() {
		return isActive;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", date=" + date + ", isActive=" + isActive + "]";
	}
	

}
