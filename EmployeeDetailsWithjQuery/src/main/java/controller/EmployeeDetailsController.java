package controller;

import database.EmployeeDatabase;
 
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.google.gson.Gson;



public class EmployeeDetailsController extends HttpServlet {
	private EmployeeDatabase employeeDatabase;

	public EmployeeDetailsController() {
		employeeDatabase = new EmployeeDatabase();
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
		String id = request.getParameter("identity");
		String employeeJsonString = new Gson().toJson(employeeDatabase.getEmployeeDetails(id));
		response.getWriter().write(
			employeeJsonString);	
	}
}
