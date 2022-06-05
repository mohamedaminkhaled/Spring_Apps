package com.spring_test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring_test.models.Student;
import com.spring_test.services.StudentService;
import com.spring_test.validation.FormValidator;


@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	FormValidator formValidator;
	
	@RequestMapping(value="/students", method = RequestMethod.GET)
	public String showStudentsPage(ModelMap model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.GET)
	public String addStudentPage(ModelMap model) {
		//throw new RuntimeException("This is error testing!");
		return "add";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String addStudent(ModelMap model,
							@RequestParam String name, 
							@RequestParam String date) {
		
		if(!formValidator.validateName(name, 3)) {
			model.addAttribute("errMsg", "Name must be more than 3 characters.");
			return "add";
		}else {
			studentService.addStudent(name, date, false);
			return "redirect:students";
		}
		
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.GET)
	public String deleteStudent(ModelMap model,
								@RequestParam int id) {
		studentService.deleteStudent(id);
		return "redirect:students";
	}
	
	@RequestMapping(value="/edit", method = RequestMethod.GET)
	public String editStudentPage(ModelMap model, @RequestParam int id) {
		model.addAttribute("student", studentService.getStudentInfo(id));
		return "edit";
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public String editStudent(ModelMap model, Student student) {
		studentService.updateStudent(student.getId(), student.getName(),student.getDate(), student.getIsActive());
		return "redirect:students";
	}
	
}



