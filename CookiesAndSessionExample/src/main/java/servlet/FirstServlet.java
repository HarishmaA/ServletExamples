package servlet;

import java.io.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {


	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String name = request.getParameter("userName");
			out.print("<h2>Welcome </h2>" + name);

			out.println("<br>");
			out.println("<br>");
			out.println("<br>");

			out.print("<h2><a href='servlet2'>Visit</a></h2>");

			HttpSession session = request.getSession();
			session.setAttribute("uname", name);
            Cookie cookie=new Cookie("uname",name);
            response.addCookie(cookie);
			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}