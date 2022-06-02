package com.course.registration.model.jpa.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.registration.model.jpa.dao.Course;



@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}