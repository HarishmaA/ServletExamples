package servlet;

import java.io.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			out.println("<h3>Hi, This is second page</h3>");
			HttpSession session = request.getSession(false);
			String myName=(String)session.getAttribute("uname");
			
			out.println(myName);
			out.println("<br>");
			Cookie ck[]=request.getCookies();
			for(int i=0;i<ck.length;i++)
			{
			out.println(ck[i].getName());
			out.println("<br>");
			out.println("Hello "+ck[i].getValue());  
			out.println("<br>");
			}
			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
