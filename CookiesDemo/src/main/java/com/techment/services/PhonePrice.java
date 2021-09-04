package com.techment.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MobilePrice
 */
@WebServlet("/PhonePrice")
public class PhonePrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PhonePrice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int price = 40000;
	
		PrintWriter pw = response.getWriter();
		int quantity = Integer.parseInt(request.getParameter("phone"));
		pw.print("============you have selected :==============\n"+quantity);
		
		double totalprice = quantity*price;
		pw.print("==============Total price==============\n"+totalprice);
		
	
		pw.print("<a href='Cart'>go to cart</a>");
	}

	

}