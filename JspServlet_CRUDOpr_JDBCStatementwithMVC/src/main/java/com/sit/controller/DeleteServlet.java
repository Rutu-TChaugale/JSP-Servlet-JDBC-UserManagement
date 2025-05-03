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
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet{
	
	StudentServiceInterface ssi= new StudentServiceIMPL();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		 Student s=new Student();
		 s.setId(id);
		 
		 List<Student> list = ssi.deletData(id);
		 req.setAttribute("StudentList", list); 
		 RequestDispatcher rd =req.getRequestDispatcher("Success.jsp"); 
		 rd.forward(req, resp);
		 
		 
		 
	}

}
