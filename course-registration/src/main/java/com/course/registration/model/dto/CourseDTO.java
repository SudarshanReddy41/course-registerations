package com.course.registration.model.dto;

import java.io.Serializable;


public class CourseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int courseId;
	private String courseName;
	
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	@Override
	public String toString() {
		return "CourseDTO [courseId=" + courseId + ", courseName=" + courseName + "]";
	}
	

}
