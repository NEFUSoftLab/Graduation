package edu.nefu.gdms.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import edu.nefu.gdms.domain.Teacher;
import edu.nefu.gdms.service.TeacherManager;

public class TeacherAction extends ActionSupport {

	/**
	 * 
	 */
	private String username;
	private String password;
	private TeacherManager teacherManager;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	} 

	public TeacherManager getTeacherManager() {
		return teacherManager;
	}
	public void setTeacherManager(TeacherManager teacherManager) {
		this.teacherManager = teacherManager;
	}
	public String login() {
		if (teacherManager.login(username, password)) {
			return SUCCESS;
		}
		return ERROR;
	}
	
	public String getAll(){
		List<Teacher> teacherList = teacherManager.getAll();
		return "teacherList";
	}
	
}
