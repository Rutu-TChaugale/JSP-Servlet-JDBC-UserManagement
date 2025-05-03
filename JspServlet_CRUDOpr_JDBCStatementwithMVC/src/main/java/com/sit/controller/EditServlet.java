package com.sit.controller;

import java.io.IOException;

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
@WebServlet("/edit")
public class EditServlet extends HttpServlet {

	StudentServiceInterface ssi = new StudentServiceIMPL();


	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
        int id = Integer.parseInt(req.getParameter("id"));
        Student stu = ssi.editData(id);

        req.setAttribute("s", stu);
        RequestDispatcher rd = req.getRequestDispatcher("Edit.jsp");
        rd.forward(req, resp);
	}
}
