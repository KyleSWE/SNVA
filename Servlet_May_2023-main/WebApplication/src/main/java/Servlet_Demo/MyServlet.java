package Servlet_Demo;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/myServlet")
public class MyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the ServletContext object
        ServletContext servletContext = getServletContext();

        // Set a custom attribute in the ServletContext
        servletContext.setAttribute("message", "Hello, ServletContext!");
        servletContext.setAttribute("password", "Admin!");

        // Get the custom attribute from the ServletContext
        String message = (String) servletContext.getAttribute("message");
        String pwd = (String) servletContext.getAttribute("password");

        // Set the response content type
        response.setContentType("text/html");

        // Write the message to the response
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Message from ServletContext:</h2>");
        out.println("<p>" + message + "</p>");
        out.println("<p>" + pwd + "</p>");
        out.println("</body></html>");
    }
}
