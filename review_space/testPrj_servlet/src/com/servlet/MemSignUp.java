package com.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemSignUp
 */
@WebServlet("/mSignUp")
public class MemSignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public MemSignUp() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("============ doget method =============== ");
		String m_name = request.getParameter("m_name");
		String m_pass = request.getParameter("m_pass");
		String m_gender = request.getParameter("m_gender");
		String[] m_hobbys = request.getParameterValues("m_hobby");
		String m_residence = request.getParameter("m_residence");
		
		System.out.println("m_name : " + m_name);
		System.out.println("m_pass : " + m_pass);
		System.out.println("m_gender : " + m_gender);
		System.out.println("m_hobbys : " + Arrays.toString(m_hobbys));
		System.out.println("m_residence : " + m_residence);
				
		Enumeration<String> names = request.getParameterNames();
		while(names.hasMoreElements()) {
			String name = (String) names.nextElement();
			System.out.println("name : " + name);
		}
	}


	
//	submit 버튼을 누르면 request doPost로 갈것이고 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
		System.out.println("============ dopost method =============== ");
		
		
		
		
	}

}
