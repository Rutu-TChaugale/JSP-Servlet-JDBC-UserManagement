package com.sit.daoIMPL;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sit.daoI.StudentDaoInterface;
import com.sit.model.Student;
import com.sit.util.JDBCconnection;

public class StudentDaoIMPL implements StudentDaoInterface {

	@Override
	public int saveData(Student s) {
		int id = 0;
		try {
		
			Statement smt = JDBCconnection.getConnection();
			String sql = "insert into student_loginorregister(fullname,email,username,password,confirm_pass) values('"+ s.getFullname() + "','" + s.getEmail() + "','" + s.getUsername() + "','" + s.getPassword1() + "','"+ s.getConfirm_pass() + "')";

			id = smt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id;

	}

	@Override
	public List<Student> loginCheck(String username, String password) {
		
		List<Student> list=null;
		try {
			Statement smt = JDBCconnection.getConnection();
			String sql = "select * from student_loginorregister where username='"+username+ "' and password='"+password+"'";

			ResultSet rs = smt.executeQuery(sql);
			if (rs.next()) {
				 list=new ArrayList<>();
				Student stu=new Student();
				
				
				stu.setId(rs.getInt("id"));
				stu.setFullname(rs.getString("fullname"));
				stu.setEmail(rs.getString("email"));
				stu.setUsername(rs.getString("username"));
				stu.setPassword1(rs.getString("password"));
				stu.setConfirm_pass(rs.getString("confirm_pass"));
				list.add(stu);
				

			} else if (username.equals("admin") && password.equals("admin")) {
				 list=new ArrayList<>();

				list=getAllData();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
		
	}

	
	public List<Student> getAllData() {

		List<Student> list = new ArrayList<>();
		try {
			Statement smt = JDBCconnection.getConnection();
			String sql = "select * from student_loginorregister";
			ResultSet rs = smt.executeQuery(sql);
			while (rs.next()) {

				Student stu = new Student();

				stu.setId(rs.getInt("id"));
				stu.setFullname(rs.getString("fullname"));
				stu.setEmail(rs.getString("email"));
				stu.setUsername(rs.getString("username"));
				stu.setPassword1(rs.getString("password"));
				stu.setConfirm_pass(rs.getString("confirm_pass"));
				
				list.add(stu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Student editData(int id) {
		Student stu=new Student();

		try {
			Statement smt = JDBCconnection.getConnection();
			String sql="select * from student_loginorregister where id='"+id+"'";
			ResultSet rs = smt.executeQuery(sql);
			if(rs.next()) {
				
				stu.setId(rs.getInt("id"));

				stu.setFullname(rs.getString("fullname"));
				stu.setEmail(rs.getString("email"));
				stu.setUsername(rs.getString("username"));
				stu.setPassword1(rs.getString("password"));
				stu.setConfirm_pass(rs.getString("confirm_pass"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stu;
	}

	@Override
	public List<Student> updateData(Student s) {
		List<Student> list=null;

		try {
			Statement smt = JDBCconnection.getConnection();
			String sql = "update student_loginorregister set fullname='" + s.getFullname() + 
                    "', email='" + s.getEmail() + 
                    "', username='" + s.getUsername() + 
                    "', password='" + s.getPassword1() + 
                    "', confirm_pass='" + s.getConfirm_pass() + 
                    "' where id=" + s.getId();
			smt.executeUpdate(sql);
			
			
			list=getAllData();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
	
		
	}

	@Override
	public List<Student> deleteData(int id) {
		List<Student> list=null;
		try {
			Statement smt = JDBCconnection.getConnection();
			String sql="delete from student_loginorregister where id='"+id+"'";
			smt.execute(sql);
			list=getAllData();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}
}
