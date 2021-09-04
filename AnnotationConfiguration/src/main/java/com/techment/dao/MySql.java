package com.techment.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MySql implements IDao {

	@Override
	public void dataBaseName() {
		// TODO Auto-generated method stub
		System.out.println("connecting to mySql data base");
	}

}
