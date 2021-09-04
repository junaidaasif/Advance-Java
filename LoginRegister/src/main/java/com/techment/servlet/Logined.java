package com.techment.servlet;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techment.connection.ConnectionProperty;



/**
 * Servlet implementation class Logined
 */
@WebServlet("/Logined")
public class Logined extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String Lemail = request.getParameter("Lemail");
		String Lpassword = request.getParameter("Lpassword");
		PrintWriter out = response.getWriter();
		int flag = 0;
		try {
//			step 1 load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loadedw");
			
//			step 2  create the connection
			Connection com = DriverManager.getConnection(ConnectionProperty.URL, ConnectionProperty.ID, ConnectionProperty.PASSWORD);
			System.out.println("connected");
			
			PreparedStatement ps = com.prepareStatement("select USER_NAME from Logined;");
			
			ResultSet rs=ps.executeQuery();
		
			
			while(rs.next())
			{
				System.out.println(rs.getString(1));
				System.out.println("this is email for ::  " +Lemail);
				if(rs.getString(1).equals(Lemail))	
				{		flag = 1;	
						System.out.println("loggedin");
						pw.print("Logged in");
				}
			}
			com.close();
			if(flag==0) {
				out.println("Please register");
				
				RequestDispatcher rd = request.getRequestDispatcher("index.html");
					
					rd.include(request,response);
			}
		}
			
		
		 catch (Exception e) {
				e.printStackTrace();
			}
	}

}
