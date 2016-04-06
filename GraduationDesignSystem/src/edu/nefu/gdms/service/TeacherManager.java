 
package edu.nefu.gdms.service;

import java.util.List;

import edu.nefu.gdms.beans.TeacherBean;


public interface TeacherManager {
	
	
	/*
	 *  
	 * 
	 * 
	 */
	
	boolean login(String username,String password);
	
	void save(TeacherBean teacher);
	
	List<TeacherBean> getAll();
	
	
	TeacherBean getByTeaNumber(String number);
}
 
