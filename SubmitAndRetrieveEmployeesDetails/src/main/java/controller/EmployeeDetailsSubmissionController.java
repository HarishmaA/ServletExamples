package controller;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import database.EmployeeDatabase;
import model.Employee;

public class EmployeeDetailsSubmissionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeDatabase employeeDatabase;

	@Override
	public void init() {
		employeeDatabase = new EmployeeDatabase();
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Integer employeeId = Integer.parseInt(request.getParameter("employeeId"));
		String employeeName = request.getParameter("employeeName");
		Integer employeeAge = Integer.parseInt(request.getParameter("employeeAge"));
		String employeeDesignation = request.getParameter("employeeDesignation");
		String teamName = request.getParameter("teamName");
		Double employeeSalary = Double.parseDouble(request.getParameter("employeeSalary"));
		if (!employeeDatabase.containsId(employeeId)) {
			employeeDatabase.addDetails(employeeId,
					new Employee(employeeId, employeeName, employeeAge, employeeDesignation, teamName, employeeSalary));
			// return success
			response.setStatus(200);
			response.getWriter().write(new Gson().toJson(employeeId));
		}
	}
}
