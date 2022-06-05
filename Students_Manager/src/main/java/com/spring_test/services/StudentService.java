package com.spring_test.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring_test.models.Student;

@Service
public class StudentService {
	
	private static int studentNumber = 4;
	private static List<Student> students = new ArrayList<Student>();
	
	static {
		students.add(new Student(1, "Mohamed amin", "2-7-1992", true));
		students.add(new Student(2, "Ahmed hesham", "4-7-1992", true));
		students.add(new Student(3, "Mamoud fathy", "7-7-1992", true));
		students.add(new Student(4, "Eslam Amr", "1-7-1992", true));
	}
	
	public List<Student> getAllStudents(){
		
		List<Student> student = new ArrayList<Student>();
		for(Student st : students) {
				student.add(st);
			}
		
		return student;
	}
	
	public void addStudent(String name, String date, boolean isActive) {
		students.add(new Student(++studentNumber, name, date, isActive));
	}
	
	public void deleteStudent(int id) {
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getId() == id) {
				iterator.remove();
			}
		}
	}
	
	public Student getStudentInfo(int id) {
		for(Student student:students) {
			if (student.getId() == id) {
				return student;
			}
		}
		return null;
	}
	
	public void updateStudent(int id, String name, String date, boolean isActive) {
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getId() == id) {
				student.setName(name);
				student.setDate(date);
			}
		}
	}
}




