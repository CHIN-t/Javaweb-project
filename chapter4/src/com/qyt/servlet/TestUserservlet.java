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
		//��ȡ�û������Ϣ
		String username="����";
		PrintWriter printWriter = response.getWriter();
		printWriter.write("�û���Ϊ��"+username+ "<br>");
		//���������ѯ������Ϣ
		request.getRequestDispatcher("/TestOrdersevlet").include(request, response);
		printWriter.write("��ѯ����");

		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
