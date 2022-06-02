package com.course.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.course.registration.model.jpa.dao.Student;
import com.course.registration.service.CourseRegistrationService;

@RestController
public class CourseRegistrationController {

	@Autowired
	private CourseRegistrationService courseRegistrationService;
	
	@PostMapping("/addStudent")
	public void addStudent(@RequestBody Student student) {
		courseRegistrationService.addStudent(student);
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public void deleteStudent(@PathVariable String id){
		courseRegistrationService.deleteStudent(id);
	}
	
	@GetMapping("/sortStudent")
	public List<Student> getStudentsSortByName() {
		return courseRegistrationService.getStudentsSortByName();
		
	}
	
	//Recording Scores
	//To Record the scores we can create a grade column on the student_courses table which is a junction table for Many to Many relationship
	//between student and courses
	
	//Find Students who dont register for given course
	//we can create a jpa native qurery to qurey all studnets who dont have courses on given course name, we can use query annotation and
	//and provide the query like
	//SELECT s.name FROM student s LEFT JOIN course c ON  s.Id = c.id WHERE c.id is NULL and c.name = "";
	//the above query will return list of students where we can return till controller
	//or use below query to retrieve who is not register the course student list 
    //	   select * 
    //	    from students 
    //		where student_id not in 
    //		(
    //		    select student_id 
    //		    from students_courses s 
    //		    inner join courses c on s.course_id  = c.course_id)


}
