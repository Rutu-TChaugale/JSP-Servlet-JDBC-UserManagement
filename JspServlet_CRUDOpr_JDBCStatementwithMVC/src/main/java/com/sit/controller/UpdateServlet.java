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

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	StudentServiceInterface ssi = new StudentServiceIMPL();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		String fullname = req.getParameter("fullname");
		String email = req.getParameter("email");
		String username = req.getParameter("username");
		String password = req.getParameter("password1");
		String confirm_password = req.getParameter("confirm_pass");

		/*
		 * only for printing purpose System.out.println("ID: " + id);
		 * System.out.println("Full Name: " + fullname); System.out.println("Email: " +
		 * email); System.out.println("Password: " + password);
		 * System.out.println("Confirm Password: " + confirm_password);
		 */

		Student s = new Student();
		s.setId(id);
		s.setFullname(fullname);
		s.setEmail(email);
		s.setUsername(username);
		s.setPassword1(password);
		s.setConfirm_pass(confirm_password);

		List<Student> list = ssi.updateData(s);
		
		
		 
		 req.setAttribute("StudentList", list); 
		 RequestDispatcher rd =req.getRequestDispatcher("Success.jsp"); 
		 rd.forward(req, resp);
		 

	}
}
