package edu.nefu.gdms.action;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionSupport;

import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.service.StudentManager;

public class JsonAction extends ActionSupport  {

	/**
	 * 
	 */
	private String username;
	private String password;
	private HttpServletRequest request;
	private StudentManager studentManager;
	private String loginRs;
	
	public String getLoginRs() {
		return loginRs;
	}
	public void setLoginRs(String loginRs) {
		this.loginRs = loginRs;
	}
	public String getUsername() {
		return username;
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
		String username = request.getParameter("number");
		String password = request.getParameter("pwd");
		System.out.println(username+"////"+password);
		if (studentManager.login(username, password)) {
			loginRs = "success";
		}
		else {
			loginRs = "fail"; 
		}
		return SUCCESS;
			
	}
	
	public String getAll(){
		List<Student> studentList = studentManager.getAll();
		return "studentList";
	}
	
}
