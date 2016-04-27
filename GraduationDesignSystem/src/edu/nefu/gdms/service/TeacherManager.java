 
package edu.nefu.gdms.service;

import java.io.File;
import java.util.List;

import edu.nefu.gdms.beans.TeacherBean;
import edu.nefu.gdms.beans.TitleBean;


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
	
	String addTitle(TitleBean titleBean,File file,String filename,TeacherBean teacherBean);
	
	
	void modify(TeacherBean teacherBean);

	void updatePassword(String pwd, String teid);
	
	List<TitleBean> getAllTitleByTeid(String teid);
	
	
}
 
