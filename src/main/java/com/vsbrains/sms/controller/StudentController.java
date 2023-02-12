package com.vsbrains.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.vsbrains.sms.entity.Student;
import com.vsbrains.sms.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

//	public StudentController(StudentService studentService) {
//		super();
//		this.studentService = studentService;
//	}

	// handler method to handle list students and return mode and view
	@GetMapping("/students")
	public  listStudents(Model model) {

		model.addAttribute("students", studentService.getAllStudent());

		return "Students";
	}

	@GetMapping("/students/new")
	public String createStudentForm(Model model) {

		Student student = new Student();
		model.addAttribute("addstud", student);

		return "create_student";

	}

	@PostMapping("/students")
	public String addStudent(@ModelAttribute("addstud") Student student) {

		studentService.addStudent(student);

		return "redirect:/students";
	}

	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("updatestd", studentService.getStudentById(id));
		return "edit_student";
	}

	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("updatestd") Student student, Model model) {

		// get student from database by id

		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstname(student.getFirstname());
		existingStudent.setLastname(student.getLastname());
		existingStudent.setEmail(student.getEmail());

		// save the updated student object in database

		studentService.updateStudent(existingStudent);

		return "redirect:/students";
	}

	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id, Model model) {

		studentService.deleteStudent(id);

		return "redirect:/students";
	}

}
