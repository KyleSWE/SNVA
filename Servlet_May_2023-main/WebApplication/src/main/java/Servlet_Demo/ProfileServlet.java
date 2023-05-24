package Servlet_Demo;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import jakarta.servlet.http.Cookie;

@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException 
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		req.getRequestDispatcher("UserLogin.html").include(req, res);
		Cookie ck[] = req.getCookies();
		
		if(ck!=null)
		{
			String name=ck[0].getValue();
			if(!name.equals("")||name!=null)
			{
				out.println("<b>Welcome to Profile Page...");
				out.println("<br>Welcome : "+name);
			}
		}else {
			out.println("pls login first...");
			req.getRequestDispatcher("Login.html").include(req, res);
		}
	}
}
