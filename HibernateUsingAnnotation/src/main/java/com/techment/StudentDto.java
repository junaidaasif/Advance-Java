package com.techment;

import javax.persistence.Id;

public class StudentDto {
	
	@Id
	int Studentid;
	String name;
	String dept;
	
	
	public StudentDto(int studentid, String name, String dept) {
		super();
		Studentid = studentid;
		this.name = name;
		this.dept = dept;
	}
	
	
	
	public StudentDto(int studentid, String name) {
		super();
		Studentid = studentid;
		this.name = name;
	}
	
	



	public StudentDto() {
		super();
	}



	public int getStudentid() {
		return Studentid;
	}
	public void setStudentid(int studentid) {
		Studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	
}
