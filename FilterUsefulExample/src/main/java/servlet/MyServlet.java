package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)  
	            throws ServletException, IOException { 
	    	response.setContentType("text/html");
	        String name=request.getParameter("name");  
	        PrintWriter out = response.getWriter();
	        out.println("Welcome "+name);
	          
	    }
}
