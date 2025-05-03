package com.sit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sit.model.Student;
import com.sit.serviceI.StudentServiceInterface;
import com.sit.serviceIMPL.StudentServiceIMPL;

@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet{
	
	StudentServiceInterface ssi=new StudentServiceIMPL();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String FullName = req.getParameter("fullname");
		String Email = req.getParameter("email");
		String UserName = req.getParameter("username");
		String Password = req.getParameter("password");
		String ConfirmPassword = req.getParameter("confirm_pass");
		
		
		
		Student s=new Student();
		s.setFullname(FullName);
		s.setEmail(Email);
		s.setUsername(UserName);
		s.setPassword1(Password);
		s.setConfirm_pass(ConfirmPassword);
		
		int id = ssi.saveData(s);
		
		if(id>=1) {
			resp.sendRedirect("Login.jsp");
		}
		else {
			resp.sendRedirect("Register.jsp");
		}
		
	}

}
