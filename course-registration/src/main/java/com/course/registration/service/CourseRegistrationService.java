package com.course.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.course.registration.model.jpa.dao.Student;
import com.course.registration.model.jpa.dao.repository.StudentRepository;


@Service

public class CourseRegistrationService {

	@Autowired
	StudentRepository studentRepository;
	
	@Transactional
	public void addStudent(Student student) {
		studentRepository.save(student);
	}

	@Transactional
	public void deleteStudent(String id) {
		studentRepository.deleteById(id);
		
	}

	@Transactional
	public List<Student> getStudentsSortByName() {
		return studentRepository.findAllOrderByNameAsc();
	}
	

}
