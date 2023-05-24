package Servlet_Demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/HiddenFormServlet")
public class HiddenFormServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException 
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String n = req.getParameter("userName");
		out.println("Welcome : "+n);
		out.println("<form action='sevlet2'>");
		out.println("<input type='hidden' name='uname' value='"+n+"'>");
		out.println("<input type='submit' value='go'>");
		out.println("</form>");
		out.close();
	}

	

}
