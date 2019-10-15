package com.qyt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestUserservlet
 */
@WebServlet("/TestUserservlet")
public class TestUserservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public TestUserservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html;charset=utf-8");
		//获取用户相关信息
		String username="张三";
		PrintWriter printWriter = response.getWriter();
		printWriter.write("用户名为："+username+ "<br>");
		//请求包含查询订单信息
		request.getRequestDispatcher("/TestOrdersevlet").include(request, response);
		printWriter.write("查询结束");

		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
