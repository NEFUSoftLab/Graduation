package edu.nefu.gdms.service;

import java.util.List;

import edu.nefu.gdms.beans.StudentBean;
import edu.nefu.gdms.domain.Student;

public interface StudentManager {
	
	
	/*
	 * 学生登录
	 * 
	 * 
	 */
	
	boolean login(String username,String password);
	
	String save(StudentBean studentBean);
	
	
	void modify(StudentBean studentBean);
	
	void remove(String sid);
	
	String  setTeacher(String studentNumber,String teacherNumber);
	
	StudentBean getByStuNumber(String number);
	
	StudentBean getBySid(String sid); 
	
	List<StudentBean> getAll();

	void updatePassword(String pwd, String sid);
	
}
