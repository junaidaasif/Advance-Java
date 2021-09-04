package com.techment.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techment.connection.ConnectionProperty;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		String Remail = request.getParameter("Remail");
		String Rpassword = request.getParameter("Rpassword");
		try {
//			step 1 load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loadedw");
			
//			step 2  create the connection
			Connection com = DriverManager.getConnection(ConnectionProperty.URL, ConnectionProperty.ID, ConnectionProperty.PASSWORD);
			System.out.println("connected");
			
			System.out.println(Remail + "this is email");
			System.out.println(Rpassword + "this is password");
			
//			Statement stmt= com.createStatement();
			PreparedStatement ps= com.prepareStatement("insert into Logined values(?, ?);");
//			stmt.execute("inset into Logined values(?, ?;");
			ps.setString(1, Remail);
			ps.setString(2, Rpassword);
			ps.execute();
			System.out.println("Inserted into db hola");
			
			
			System.out.println("Registered");
			pw.print("Registerd successfully" );

		
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}

}
