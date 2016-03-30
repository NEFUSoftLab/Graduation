package edu.nefu.gdms.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.service.StudentManager;

public class StudentAction extends ActionSupport {

	/**
	 * 
	 */
	private String username;
	private String password;
	private StudentManager studentManager;
	
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
	public StudentManager getStudentManager() {
		return studentManager;
	}
	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
	}

	public String login() {
		if (studentManager.login(username, password)) {
			return SUCCESS;
		}
		return ERROR;
	}
	
	public String getAll(){
		List<Student> studentList = studentManager.getAll();
		return "studentList";
	}
	
}
