package edu.nefu.gdms.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.nefu.gdms.beans.TeacherBean;
import edu.nefu.gdms.domain.Teacher;
import edu.nefu.gdms.service.TeacherManager;

public class TeacherAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TeacherManager teacherManager;
	
	private String number;
	private String pwd;
	
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
	private TeacherBean teacherBean;
	
	
	private String login; 
	

	public TeacherBean getTeacherBean() {
		return teacherBean;
	}
	public void setTeacherBean(TeacherBean teacherBean) {
		this.teacherBean = teacherBean;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

	public TeacherManager getTeacherManager() {
		return teacherManager;
	}
	public void setTeacherManager(TeacherManager teacherManager) {
		this.teacherManager = teacherManager;
	}
	//登陆
	public String login() {
		login="";
		try{
			if (teacherManager.login(number, pwd)) {
				login = "success";
				teacherBean = teacherManager.getByTeaNumber(number);
				 ActionContext.getContext().getSession().put("teacher", teacherBean);
			}
			else{
				login = "fail";
			}
			
		}catch(Exception e) {
			login="fail";
			e.printStackTrace();	
		}
		return SUCCESS;
	}
	//跳转到主页面
	public String index(){
		return "index";
	}
	//退出
	public String out(){
		ActionContext.getContext().getSession().put("student", null);
		return "out";
	}
}
