package com.incapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Hello implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter out=null;
		try {
			out=res.getWriter();
			out.print("<html>");
			out.print("<body>");
			out.print("<h1>Welcome to Hello Web App</h1>");
			out.print("<hr/>");
			out.print("<p>This is first Helping Program</p>");
			//java.util.Date d=new java.util.Date(); //allowed 
			java.time.LocalDateTime d=java.time.LocalDateTime.now(); //allowed 
			out.print("<p>Current Date Time: "+d+"</p>");
			out.print("</body>");
			out.print("</html>");
			out.close();
		}catch (Exception e) {
			out.print(e);
			out.close();
		}
	}
	
}
