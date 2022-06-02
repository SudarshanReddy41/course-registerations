package com.course.registration.model.dto;

import java.io.Serializable;

public class StudentDTO  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int studentId;
	private String studentName;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	@Override
	public String toString() {
		return "CourseDTO [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

}
