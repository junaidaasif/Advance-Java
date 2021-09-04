package com.techment.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlConnectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
//			step 1 load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loadedw");
			
//			step 2  create the connection
			Connection com = DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false", "root", "Junaid@123");
			System.out.println("connected");
			
			Statement stmt= com.createStatement();
			stmt.execute("inset into employee values(3, 'junaid', 34000;");
			System.out.println("Inserted");
			

			ResultSet rs=stmt.executeQuery("select * from employee");
			 while(rs.next())
			 {
				 System.out.println(rs.getInt(1) + " "+rs.getString(2)+" "+rs.getInt(3));
			 }
		}
		
		 catch (Exception e) {
				e.printStackTrace();
			}
	}

}
