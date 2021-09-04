package com.techment.userDate;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class userDate
 */
@WebServlet("/userDate")
public class userDate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		
		PrintWriter out = null;
		try {
			out = response.getWriter();
			String takeDate = request.getParameter("takeDate");
			
			out.print(takeDate);
//			DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd"); //to take date and format in java required form
//			
//			LocalDate birthDate = LocalDate.parse(takeDate, dtf1);
//			out.println("Birthdate : " + birthDate); //yy-mm-dd
			
		}
		catch(Exception e) {
			out.println("Error  : some error");
		}
			
		
		
	}

}
