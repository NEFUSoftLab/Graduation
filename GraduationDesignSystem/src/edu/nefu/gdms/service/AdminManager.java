package edu.nefu.gdms.service;

import java.util.List;

import edu.nefu.gdms.beans.StudentBean;
import edu.nefu.gdms.beans.TeacherBean;
import edu.nefu.gdms.domain.Student;

public interface AdminManager {
	
	
	/*
	 * 管理员登录
	 * 
	 * 
	 */
	
	boolean login(String username,String password);
	
	void quickGroup();
	
	public void setTeacher(StudentBean student,TeacherBean teacher);
	
	public void delTeacher(TeacherBean teacher);
	
	public void addTeacher(TeacherBean teacherBean);
	
	
}
