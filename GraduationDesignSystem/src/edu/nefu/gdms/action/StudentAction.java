package edu.nefu.gdms.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import edu.nefu.gdms.beans.StudentBean;
import edu.nefu.gdms.service.StudentManager;

public class StudentAction extends ActionSupport {

	/**
	 * 
	 */
	private String username;
	private String password;
	
	
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


	
	private StudentManager studentManager;
	
	
	public StudentManager getStudentManager() {
		return studentManager;
	}


	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
	}


	public String execute() throws Exception{
		
		if (studentManager.login(username, password)) {
			return SUCCESS;
		}
		return ERROR;
	}
	
}
