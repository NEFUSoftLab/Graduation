 
package edu.nefu.gdms.service;

import java.util.List;

import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.domain.Teacher;

public interface TeacherManager {
	
	
	/*
	 *  
	 * 
	 * 
	 */
	
	boolean login(String username,String password);
	
	void save(Teacher student);
	
	List<Teacher> getAll();
	
}
 
