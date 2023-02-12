package com.vsbrains.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vsbrains.sms.entity.Student;
import com.vsbrains.sms.repository.StudentRepository;
import com.vsbrains.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

//	@Autowired
//	public StudentServiceImpl(StudentRepository studentRepository) {
//		super();
//		this.studentRepository = studentRepository;
//	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	public Student addStudent(Student student) {

		Student std = studentRepository.save(student);

		return std;
	}

	@Override
	public Student getStudentById(Long id) {

		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}

}
