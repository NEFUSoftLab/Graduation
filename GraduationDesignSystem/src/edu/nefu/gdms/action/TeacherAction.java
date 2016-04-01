package edu.nefu.gdms.action;

import java.util.List;

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
	public String login() {
		login="";
		try{
			if (teacherManager.login(teacherBean.getNumber(), teacherBean.getPwd())) {
				login = "success";
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
	
}
