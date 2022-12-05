package com.flyaway.admin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String classes;
	private String student;
	private String teacher;
	private String subject;
	
	public Admin() {}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Admin(Long id, String classes, String student, String teacher, String subject) {
		super();
		this.id = id;
		this.classes = classes;
		this.student = student;
		this.teacher = teacher;
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", classes=" + classes + ", student=" + student + ", teacher=" + teacher
				+ ", subject=" + subject + "]";
	}
	
	
		
	
		
	
	
		
	
	
}
