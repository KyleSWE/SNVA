package Servlet_Demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="ServletConfigDemo", urlPatterns="/ServletConfigDemo", 
initParams={ @WebInitParam(name="name", value="MyServlet") })
public class ServletConfigDemo extends HttpServlet {
	
	private String message;
	
	public void init() throws ServletException
	{
		message=getServletConfig().getInitParameter("name");
	}
	
		protected void doGet(HttpServletRequest req, HttpServletResponse res) 
				throws ServletException, IOException 
	{
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.println("<html><body>");
			out.println("<h2>Servlet Config Demo </h2>");
			out.println("<p>Message from Servlet Configuration: "+message+" </p>");
			out.println("</body></html>");
		
	}

	
}
