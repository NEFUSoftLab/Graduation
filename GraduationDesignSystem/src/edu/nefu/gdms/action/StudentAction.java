package edu.nefu.gdms.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.nefu.gdms.beans.StudentBean;
import edu.nefu.gdms.service.StudentManager;

public class StudentAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Gson gson=new Gson();
	HttpServletRequest request;
	private String number;
	private String pwd;
	private StudentBean studentBean;
	private StudentManager studentManager;
	//登录结果
	private String login;  
	//查询所有学生
	private String getAll;
	//移除
	private String remove;
	//修改
	private String modify;
	//保存
	private String save;
	
	
	
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



	
	 
	 
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getGetAll() {
		return getAll;
	}
	public void setGetAll(String getAll) {
		this.getAll = getAll;
	}
	public String getRemove() {
		return remove;
	}
	public void setRemove(String remove) {
		this.remove = remove;
	}
	public String getModify() {
		return modify;
	}
	public void setModify(String modify) {
		this.modify = modify;
	}
	public String getSave() {
		return save;
	}
	public void setSave(String save) {
		this.save = save;
	}
	public StudentManager getStudentManager() {
		return studentManager;
	}
	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
	}
	public StudentBean getStudentBean() {
		return studentBean;
	}
	public void setStudentBean(StudentBean studentBean) {
		this.studentBean = studentBean;
	}
	
	
	

	//判断登录
	public String login() {
		login = "";
		//System.out.println(studentBean.getNumber()+".."+studentBean.getPwd());
		try{
			if (studentManager.login(number,pwd)) {
				login = "success";
				studentBean = studentManager.getByStuNumber(number);
				 ActionContext.getContext().getSession().put("student", studentBean);
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
	//退出
	public String out(){
		ActionContext.getContext().getSession().put("student", null);
		return "out";
	}
	
	public String modify() {
		try {
			modify = "success";
			studentManager.modify(studentBean);
			
		}catch (Exception e) {
			modify = "fail";
			e.printStackTrace();
			
		}
		return SUCCESS;
	}
	
	
	
	
	
	//跳转到主页面
	public String index(){
		return "index";
	}
	
	
}
