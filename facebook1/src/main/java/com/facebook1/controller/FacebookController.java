package com.facebook1.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.facebook1.dao.Facebook1DAO;
import com.facebook1.dao.Facebook1DAOInterface;

public class FacebookController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String first_name=request.getParameter("fname");
		String s_name=request.getParameter("sname");
		String s_email=request.getParameter("email");
		String s_password=request.getParameter("password");
		String s_phone=request.getParameter("phone");
		
		Facebook1DAOInterface fd=new Facebook1DAO();
		
		int i=fd.createProfile(first_name, s_name, s_email, s_password, s_phone);
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html><body>");
		    if(i>0) {
		    	out.println("Registration Success ");
		    }
		    else {
		    	out.println("Registration Fail ");
		    }
			
		out.println("</body></html>");
	}

}
