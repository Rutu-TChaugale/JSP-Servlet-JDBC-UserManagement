package com.sit.controller;

import java.io.IOException;


import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sit.model.Student;
import com.sit.serviceI.StudentServiceInterface;
import com.sit.serviceIMPL.StudentServiceIMPL;

@WebServlet("/log")
public class LoginServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

	StudentServiceInterface ssi=new StudentServiceIMPL();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		
	
		List<Student> list = ssi.loginCheck(username, password);
		
			
		if(list!=null && !list.isEmpty()) {
			
			req.setAttribute("StudentList", list);
			RequestDispatcher rd=req.getRequestDispatcher("Success.jsp");	
			rd.forward(req, resp);
		}
		
		else {
            req.setAttribute("errorMessage", "Invalid Username and Password !!!"); 
            req.getRequestDispatcher("Login.jsp").forward(req, resp); 
        }
		
	}

}
