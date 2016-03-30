package edu.nefu.gdms.service;

import java.util.List;

import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.domain.Teacher;

public interface TeacherManager {
	
	
	/*
	 * 学生登录
	 * 
	 * 
	 */
	
	boolean login(String username,String password);
	
	void save(Teacher student);
	
	List<Teacher> getAll();
	
}
