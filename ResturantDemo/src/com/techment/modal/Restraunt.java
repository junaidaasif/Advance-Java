package com.techment.modal;

import java.util.List;

public class Restraunt {
	String restrauntName;
	IHotDrink hotDrink;
	ISoftDrink softDrink;
//	List<String>employee;
//	Tea tea;
	
	
	public void setRestrauntName(String restrauntName) {
		this.restrauntName = restrauntName;
	}
	
//	public void setTea(Tea tea) {
//		this.tea = tea;
//	}

	

//	public List<String> getEmployee() {
//		return employee;
//	}

	public void setHotDrink(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}

	public void setSoftDrink(ISoftDrink softDrink) {
		this.softDrink = softDrink;
	}

	public void displayMessage() {
		System.out.println("restraunt name :" + restrauntName);
		hotDrink.drink();
		softDrink.drink();
	}
	
	
}
