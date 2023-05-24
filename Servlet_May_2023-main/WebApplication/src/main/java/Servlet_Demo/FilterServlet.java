package Servlet_Demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/FilterServlet")
public class FilterServlet extends HttpServlet
{
	
    
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException 
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.println("Welcome to servlet");
	}

	

}
