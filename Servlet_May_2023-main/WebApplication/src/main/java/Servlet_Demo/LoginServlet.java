package Servlet_Demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Cookie;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException 
	{
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		String name =req.getParameter("name");
		String password =req.getParameter("password");
		
		if(password.equals("admin"))
		{
			out.println("You are successfully logged in...");
			out.println(" Welcome : "+name);
			
			Cookie ck = new Cookie("uname",name);
			res.addCookie(ck);
		}else {
			out.println("user name or password incorrect...");
		}
		out.close();
	}

}
