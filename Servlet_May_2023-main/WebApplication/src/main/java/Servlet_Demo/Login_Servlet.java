package Servlet_Demo;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login_Servlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		String n = req.getParameter("userName");
		String p =req.getParameter("userPass");
		
		if(p.equals("admin"))
		{
			RequestDispatcher rd =req.getRequestDispatcher("welcome");
			rd.forward(req, res);
		}else {
			pw.print("Sorry ! incorrect username and password");
			RequestDispatcher rd =req.getRequestDispatcher("/User_Login.html");
			rd.include(req, res);
		}
	}

}
