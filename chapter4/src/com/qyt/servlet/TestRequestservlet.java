package com.qyt.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestRequestservlet
 */
@WebServlet("/TestRequestservlet")
public class TestRequestservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public TestRequestservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String username = (String) request.getAttribute("username");
		System.out.println(username);
		request.setAttribute("username", "ÕÅÈý");
		username = (String) request.getAttribute("username");
		System.out.println(username);
		request.removeAttribute("username");
		username = (String) request.getAttribute("username");
		System.out.println(username);

		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		doGet(request, response);
	}

}
