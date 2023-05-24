package Servlet_Demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Cookie;
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException 
	{
		req.getRequestDispatcher("UserLogin.html").include(req, res);
		
		Cookie ck = new Cookie("uname","");
		ck.setMaxAge(0);
		res.addCookie(ck);
		
		PrintWriter out = res.getWriter();
		out.println("you are successfully logged out!...");
		
	}


}
