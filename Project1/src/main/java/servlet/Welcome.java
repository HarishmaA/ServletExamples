package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(name = "Welcome", urlPatterns = { "/welcome" })
public class Welcome extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String name = request.getParameter("NAME");
		String phoneNo = request.getParameter("PHONE NO");
		PrintWriter out = response.getWriter();
		out.println("Hello, " + name + ", we received the phone number " + phoneNo);

	}
}