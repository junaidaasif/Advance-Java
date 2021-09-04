package com.techment;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="student500")
public class Student {
		
	@Id
	int Studentid;
	String name;
	String dept;
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


