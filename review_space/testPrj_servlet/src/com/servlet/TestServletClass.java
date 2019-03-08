package com.servlet;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tsc")
public class TestServletClass extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println("=========do get ()==========");
		
		
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	@PostConstruct
	public void funPc() {
		System.out.println("=========@ Postconstruct ()==========");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("=========init ()==========");
	}
	
	@Override
	public void destroy() {
		System.out.println("=========destroy ()===========");
	}
	
	@PreDestroy
	public void funpd() {
		System.out.println("=========funpd()==========");
	}
	

}
