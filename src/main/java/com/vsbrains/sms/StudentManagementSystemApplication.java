package com.vsbrains.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.vsbrains.sms.entity.Student;
import com.vsbrains.sms.repository.StudentRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.vsbrains.sms.repository")
@EntityScan
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
//		Student student = new Student("Vikrant", "Mandalia", "vikrant.mandalia@capgemini.com");
//		studentRepository.save(student);
//		
//		Student student1 = new Student("Sunita", "Mandalia", "sm@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Zili", "Mandalia", "zm@gmail.com");
//		studentRepository.save(student2);
//		
	}

}
