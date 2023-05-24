package Servlet_Demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebInitParam;

@WebServlet(
		urlPatterns={"/ConfigDemoServlet"},
		initParams= {
		@WebInitParam(name="driver",value="com.mysql.jdbc.driver"),
		@WebInitParam(name="dbName",value="TestDb"),
		@WebInitParam(name="userName",value="root"),
		@WebInitParam(name="password",value="root")
		}
		)
public class ConfigDemoServlet extends HttpServlet
{
	private String driver;
	private String dbName;
	private String userName;
	private String password;	
	public void init() throws ServletException
	{
		driver=getServletConfig().getInitParameter("driver");
		dbName=getServletConfig().getInitParameter("dbName");
		userName=getServletConfig().getInitParameter("userName");
		password=getServletConfig().getInitParameter("password");
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	
	out.println("<html><body>");
	out.println("<h2>Servlet Configuration Demo </h2>");
	out.println("<p>Driver : "+driver+"</p>");
	out.println("<p>DbName : "+dbName+"</p>");
	out.println("<p>userName : "+userName+"</p>");
	out.println("<p>password : "+password+"</p>");
	out.println("<body></html");
	}

}
