package com.student_managment_system1.controller;

import java.io.IOException;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student_managment_system1_dao.StudentDao;
import com.student_managment_system1_dto.Student;

@WebServlet("/save")
public class SaveStudent extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("studentName");
		String stringPhoneNumber =req.getParameter("studentPhoneNumber");
		String email = req.getParameter("studentEmail");
		 
		long PhoneNumber = Long.parseLong(stringPhoneNumber);
		
		ServletContext context = getServletContext();
		String fee = context.getInitParameter("StudentFee");
		
		double studentFee = Double.parseDouble(fee);
		
	    Student student = new Student();
	    student.setStudentName(name);
	    student.setStudentPhoneNumber(PhoneNumber);
	    student.setStudentEmail(email);
	    student.setStudentFee(studentFee);
	    
	    new StudentDao().saveStudent(student);
	}
}
