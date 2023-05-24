package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import Model.Emp;
import DAO.EmpDao;

@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException 
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name =req.getParameter("name");
		String password=req.getParameter("password");
		String email =req.getParameter("email");
		String country =req.getParameter("country");
		
		Emp e = new Emp();
		e.setName(name);
		e.setPassword(password);
		e.setEmail(email);
		e.setCountry(country);
		
		int status =EmpDao.save(e);
		if(status>0)
		{
			out.print("Record Inserted Successfully");
			req.getRequestDispatcher("jdbc.html").include(req, res);
		}else {
			out.println("Sorry! unable to save the record");
		}
	}

}
