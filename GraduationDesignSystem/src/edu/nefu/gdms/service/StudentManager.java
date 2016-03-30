package edu.nefu.gdms.service;

import java.util.List;

import edu.nefu.gdms.domain.Student;

public interface StudentManager {
	
	
	/*
	 * 学生登录
	 * 
	 * 
	 */
	
	boolean login(String username,String password);
	
	void save(Student student);
	
	List<Student> getAll();
	
}
