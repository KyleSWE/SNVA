package Servlet_Demo;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/world")
public class HelloWorldServlet extends HttpServlet 
{
protected void doGet(HttpServletRequest req,HttpServletResponse res) 
		throws ServletException,IOException
{
	res.setContentType("text/html");
	res.getWriter().println("<h1>Hello World... Welcome to Servlet</h1>");
}

}

