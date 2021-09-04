package com.techment.modal;

public class Employee {
	
	int id;
	String name;
	int Salary;
	
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}

	
	public Employee(String name) {
		super();
		this.name = name;
		System.out.println("name const. called......");
	}

	

	public Employee(int salary) {
		super();
		Salary = salary;
		System.out.println("salry const. called......");
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}
	
	
	
}
