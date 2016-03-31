package edu.nefu.gdms.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionSupport;

import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.service.StudentManager;
import net.sf.json.JSONObject;

public class StudentAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String number;
	private String pwd;
	private StudentManager studentManager;
	private String loginRs;  

	 
	

	public String getLoginRs() {
		return loginRs;
	}
	public void setLoginRs(String loginRs) {
		this.loginRs = loginRs;
	}
	public StudentManager getStudentManager() {
		return studentManager;
	}
	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
	}

	public String login() {
		try{
			
            //JSONObject json = JSONObject.fromObject(map);//将map对象转换成json类型数据
			if (studentManager.login(number, pwd)) {
				loginRs = "success";
			}
			else{
				loginRs = "fail";
			}
		}catch(Exception e) {
			loginRs = "fail";
			e.printStackTrace();
		}
		return SUCCESS;
		
	}
	
	public String getAll(){
		List<Student> studentList = studentManager.getAll();
		return "studentList";
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	
}
