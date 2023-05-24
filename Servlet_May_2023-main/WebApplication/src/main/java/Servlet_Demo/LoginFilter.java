package Servlet_Demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter("/FilterServlet")
public class LoginFilter implements Filter {

	public void init(FilterConfig filterConfig)
	{
		
	}
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException
	{
		
	PrintWriter out = res.getWriter();
	out.println("filter is invoked before request");
	chain.doFilter(req, res);
	out.println("filter invoked after response");
		
	}
	
	public void destroy()
	{
		
	}

}
