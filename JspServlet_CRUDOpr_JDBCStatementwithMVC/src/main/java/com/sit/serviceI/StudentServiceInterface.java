package com.sit.serviceI;

import java.util.List;

import com.sit.model.Student;

public interface StudentServiceInterface {

	public int saveData(Student s);
	
	public List<Student> loginCheck(String username,String password);
	
	public Student editData(int id);
	
	public List<Student> updateData(Student s);

	public List<Student> deletData(int id);
}
