package com.vsbrains.sms.service;

import java.util.List;

import com.vsbrains.sms.entity.Student;

public interface StudentService {

	List<Student> getAllStudent();

	Student addStudent(Student student);

	Student getStudentById(Long id);

	Student updateStudent(Student student);

	void deleteStudent(Long id);
}
