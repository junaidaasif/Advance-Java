package Perform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 

/**
 * Servlet implementation class EOCheck
 */
@WebServlet("/EOCheck")
public class EOCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		response.setContentType("text/html");
		
		
		PrintWriter out = null;
		try {
			out = response.getWriter();
			int n = Integer.parseInt(request.getParameter("t1"));
			out.println("<center>");
			if(n%2==0) {
				out.println(n+ "is an even no.");
			}
			else {
				out.println(n + "is odd no.");
			}
		}
		catch(Exception e) {
			out.println("Error :");
		}
			
		
		
		
		
		
		
		
		
	}

}
