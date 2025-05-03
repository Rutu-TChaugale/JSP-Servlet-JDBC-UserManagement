package com.sit.serviceIMPL;

import java.util.List;

import com.sit.daoI.StudentDaoInterface;
import com.sit.daoIMPL.StudentDaoIMPL;
import com.sit.model.Student;
import com.sit.serviceI.StudentServiceInterface;

public class StudentServiceIMPL implements StudentServiceInterface{

	StudentDaoInterface sdi=new StudentDaoIMPL();
	@Override
	public int saveData(Student s) {
		int id = sdi.saveData(s);
		return id;
		
		
	}
	@Override
	public List<Student> loginCheck(String username, String password) {
		List<Student> list = sdi.loginCheck(username, password);
		return list;
	}
	@Override
	public Student editData(int id) {
		Student stu = sdi.editData(id);
		return stu;
	}
	@Override
	public List<Student> updateData(Student s) {
		List<Student> list = sdi.updateData(s);
		return list;
		
		
	}
	@Override
	public List<Student> deletData(int id) {
		List<Student> list= sdi.deleteData(id);
		return list;
	}
	

	
}
