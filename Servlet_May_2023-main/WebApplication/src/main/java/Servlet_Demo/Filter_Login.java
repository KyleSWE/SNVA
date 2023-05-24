package Servlet_Demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;


@WebFilter("/AdminServlet")
public class Filter_Login implements Filter
{

   
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) 
			throws IOException, ServletException 
	{
		PrintWriter out = res.getWriter();
		String pwd = req.getParameter("password");
		
		if(pwd.equals("admin123"))
		{
			chain.doFilter(req, res);
		}else {
			out.println("Username or password error");
			RequestDispatcher rd = req.getRequestDispatcher("Filter.html");
			rd.include(req, res);
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
