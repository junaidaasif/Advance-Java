package com.techment.dao;

import org.springframework.stereotype.Service;

@Repository
public class Oracle implements IDao {
	
	public void dataBaseName() {
		System.out.println("connecting to oracle datbase");
	}

}
