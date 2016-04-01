package edu.nefu.gdms.action;

import java.util.List;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

import edu.nefu.gdms.beans.StudentBean;
import edu.nefu.gdms.service.StudentManager;

public class StudentAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Gson gson=new Gson();
	
	private StudentBean student;
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
		System.out.println(student.getNumber()+".."+student.getPwd());
		try{
			if (studentManager.login("1","2")) {
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
		List<StudentBean> studentList = studentManager.getAll();
		getAll =  gson.toJson(studentList);
		System.out.println(getAll);
		return SUCCESS;
	}
	public StudentBean getStudent() {
		return student;
	}
	public void setStudent(StudentBean student) {
		this.student = student;
	}
}
