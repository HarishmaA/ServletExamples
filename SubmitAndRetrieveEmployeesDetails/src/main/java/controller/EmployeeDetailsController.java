package controller;

import database.EmployeeDatabase;
import model.Employee;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

public class EmployeeDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeDatabase employeeDatabase;

	@Override
	public void init() {
		employeeDatabase = new EmployeeDatabase();
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Integer id = Integer.valueOf(request.getParameter("identity"));
		Employee employee = employeeDatabase.getEmployeeDetails(id);
		String employeeJsonString;
		if (employee != null)
			employeeJsonString = new Gson().toJson(employee);
		else
			employeeJsonString = "ID DOES NOT EXISTS!!!";

		response.getWriter().write(employeeJsonString);
		System.out.println(employeeJsonString);
	}
}




