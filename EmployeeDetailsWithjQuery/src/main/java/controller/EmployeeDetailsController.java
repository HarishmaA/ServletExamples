package controller;

import database.EmployeeDatabase;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

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
		String employeeJsonString = new Gson().toJson(employeeDatabase.getEmployeeDetails(id));
		response.getWriter().write(employeeJsonString);
	}
}



//ObjectWriter objectWriter = new
		// ObjectMapper().writer().withDefaultPrettyPrinter();
		// try {
		// String employeeJsonString=
		// objectWriter.writeValueAsString(employeeDatabase.getEmployeeDetails(id));
		// }
		// catch(JsonGenerationException e) {
		// e.printStackTrace();
		// }
		// catch(JsonMappingException e) {
		// e.printStackTrace();
		// }
