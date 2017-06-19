package com.isuru.domain;

import java.beans.Transient;
import java.lang.annotation.Target;

public class Announcement {
	
	private String message;
	private String type;
	private Student student;
		
	public Announcement(String message, String type, Student student) {
		this.message = message;
		this.type = type;
		this.student = student;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String sendMessage(Student student){
		return String.format("%s : %s for %s", this.type, this.message, student.getFirstName());
	}

}
