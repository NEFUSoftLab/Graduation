package edu.nefu.gdms.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.opensymphony.xwork2.ActionSupport;

import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.service.StudentManager;
import net.sf.json.JSONObject;

public class StudentAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Gson gson=new Gson();
	
	private String number;
	private String pwd;
	private StudentManager studentManager;
	//登录结果
	private String login;  
	//查询所有学生
	private String getAll;
	
	public String getGetAll() {
		return getAll;
	}
	public void setGetAll(String getAll) {
		this.getAll = getAll;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public StudentManager getStudentManager() {
		return studentManager;
	}
	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
	}

	//判断登录
	public String login() {
		login = "";
		try{
			if (studentManager.login(number, pwd)) {
				login = "success";
			}
			else{
				login = "fail";
			}
		}catch(Exception e) {
			login = "fail";
			e.printStackTrace();
		}
		return SUCCESS;
		
	}
	
	
	//取得所有学生数据
	public String getAll(){
		getAll = "";
		System.out.println("yes");
		List<Student> studentList = studentManager.getAll();
		getAll =  gson.toJson(studentList);
		System.out.println(getAll);
		return SUCCESS;
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
