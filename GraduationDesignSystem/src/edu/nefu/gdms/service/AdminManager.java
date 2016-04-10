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
	
	//管理员登录
	boolean login(String username,String password);
	
	//学生分配老师
	void quickGroup();
	
	//单独为学生设置老师
	public void setTeacher(StudentBean student,TeacherBean teacher);
	
	//删除老师
	public void delTeacher(TeacherBean teacher);
	
	//增加老师
	public void addTeacher(TeacherBean teacherBean);
	
	//为老师分配组
	public void addGroup();
	
	//为老师单独分配组
	public void setGroupForTea(String number,String name);
	
	
}
