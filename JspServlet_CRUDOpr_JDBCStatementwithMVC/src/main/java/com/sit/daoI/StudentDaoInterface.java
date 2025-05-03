package com.sit.daoI;

import java.util.List;

import com.sit.model.Student;

public interface StudentDaoInterface {
	
	public int saveData(Student s);

	public List<Student> loginCheck(String username,String password);
	
	public Student editData(int id);
	
	public List<Student> updateData(Student s);

	public List<Student> deleteData(int id);


}
