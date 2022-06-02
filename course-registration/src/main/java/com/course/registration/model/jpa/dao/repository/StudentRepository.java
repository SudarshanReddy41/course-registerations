package com.course.registration.model.jpa.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.registration.model.jpa.dao.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	List<Student> findAllOrderByNameAsc();

	void deleteById(String id);
	
}