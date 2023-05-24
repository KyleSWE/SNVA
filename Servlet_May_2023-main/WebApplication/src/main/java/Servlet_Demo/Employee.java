package Servlet_Demo;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Employee")
public class Employee extends HttpServlet  
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		response.setContentType("text/html");
		response.getWriter().println("<!DOCTYPE html>");
		response.getWriter().println("<html>");
		response.getWriter().println("<head>");
		response.getWriter().println("<title>Employee Page</title>");
		response.getWriter().println("</head>");
		response.getWriter().println("<body>");
		response.getWriter().println("<table border='2'>");
		response.getWriter().println("<thead><th>ID</th><th>Name</th><th>Dept</th></thead>");
		response.getWriter().println("<tbody><tr><td>10011</td><td>John</td><td>Development</td></tr>");
		response.getWriter().println("<tr><td>10022</td><td>Rohith</td><td>Development</td></tr>");
		response.getWriter().println("<tr><td>10033</td><td>Vimala</td><td>Testing</td></tr>");
		response.getWriter().println("<tr><td>10044</td><td>Radha</td><td>Admin</td></tr>");
		response.getWriter().println("</tbody></table></body></html>");
			
	}

	

}
