package edu.nefu.gdms.service;

import edu.nefu.gdms.beans.GrourBean;
import edu.nefu.gdms.beans.PageBean;
import edu.nefu.gdms.beans.StudentBean;
import edu.nefu.gdms.beans.SystimeBean;
import edu.nefu.gdms.beans.TeacherBean;

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
	public void addGroup(int groupNum);
	
	//为老师单独分配组
	public void setGroupForTea(String number,String name);
	
	//得到所有的老师
	public PageBean getAllTeacher(int pageSize,int page);
	
	//得到所有的学生
	public PageBean getAllStudent(int pageSize,int page);
	
	//设定各个阶段时间
	public void addSystime(SystimeBean systime);
	
	//修改时间段
	public void updateSystime(SystimeBean systimeBean);
	
	//删除时间
	public void delSystime(SystimeBean systimeBean);
	
	//增加组别
	public void addGrour(int num);
	
	//修改组属性 
	public void updateGrour(GrourBean grourBean);
	
	//删除组别
	public void delGrour(GrourBean grourBean);
	
}
