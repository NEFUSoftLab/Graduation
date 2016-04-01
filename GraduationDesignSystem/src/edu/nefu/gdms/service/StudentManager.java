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
	
	String save(String number,String name,String pwd,String phone,String sex,String major,String email);
	
	
	void modify(StudentBean studentBean);
	
	void remove(String sid);
	
	String  setTeacher(String studentNumber,String teacherNumber);
	
	
	StudentBean getBySid(String sid); 
	
	List<StudentBean> getAll();
	
}
