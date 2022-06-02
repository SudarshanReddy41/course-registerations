package com.course.registration.model.dto;

import org.springframework.beans.factory.annotation.Autowired;

import com.course.registration.model.jpa.dao.Student;

public class ResourceMapper {
	
	@Autowired
	ResourceMapper mapper;
	
	public StudentDTO convertbyStudent (Student student) {
		StudentDTO studentDTO = new StudentDTO();
		return studentDTO = mapper.convertbyStudent(student);

	}
	
	public Student convertbyStudentDTO (StudentDTO studentDTO) {
		Student student = new Student();
		return student = mapper.convertbyStudentDTO(studentDTO);

	}

}
