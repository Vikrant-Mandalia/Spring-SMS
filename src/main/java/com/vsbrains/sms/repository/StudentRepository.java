package com.vsbrains.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vsbrains.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
