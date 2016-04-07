package edu.nefu.gdms.service;

import java.util.List;

import edu.nefu.gdms.beans.StudentBean;
import edu.nefu.gdms.domain.Student;

public interface AdminManager {
	
	
	/*
	 * 管理员登录
	 * 
	 * 
	 */
	
	boolean login(String username,String password);
	
	void quickGroup();
	
}
