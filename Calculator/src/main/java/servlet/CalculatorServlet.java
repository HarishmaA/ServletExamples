package servlet;

import javax.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class CalculatorServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int firstNumber = Integer.parseInt(request.getParameter("FirstNumber"));
		int secondNumber = Integer.parseInt(request.getParameter("SecondNumber"));
		response.setContentType("text/html");
		String op = request.getParameter("op");
		PrintWriter out = response.getWriter();

		if (op.equals("Addition")) {
			out.println("<h4>The result is  </h4>"+ (firstNumber + secondNumber));
		} else if (op.equals("Subtraction")) {
			out.println("<h4>The result is  </h4>"+ (firstNumber - secondNumber));
		} else if (op.equals("Multiplication")) {
			out.println("<h4>The result is  </h4>"+ (firstNumber * secondNumber));
		} else {
			out.println("<h4>The result is  </h4>"+ (firstNumber / secondNumber));
		}

	}
}
