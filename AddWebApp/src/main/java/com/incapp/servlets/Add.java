package com.incapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Add implements Servlet{

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
			
			String s1=req.getParameter("num1");
			String s2=req.getParameter("num2");
			int n1=Integer.parseInt(s1);
			int n2=Integer.parseInt(s2);
			int n=n1+n2;
			
			out.print("<html>");
			out.print("<body>");
			out.print("<h1>Add Web App</h1>");
			out.print("<hr/>");
			out.print("<p>Sum: "+n+"</p>");
			out.print("</body>");
			out.print("</html>");
			out.close();
		}catch (Exception e) {
			out.print(e);
			out.close();
		}
	}

}

