package com.techment.modal;

public class University {
	
	Department department;
	int noofStudent;

	
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	public void setNoofStudent(int noofStudent) {
		this.noofStudent = noofStudent;
	}
	
	public void displayDeptDetails() {
		department.deptDetails();
		System.out.println(noofStudent);
	}
	
}
