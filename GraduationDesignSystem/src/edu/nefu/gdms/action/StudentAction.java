package edu.nefu.gdms.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.nefu.gdms.beans.StudentBean;
import edu.nefu.gdms.service.StudentManager;

public class StudentAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Gson gson = new Gson();
	HttpServletRequest request;
	private String number;
	private String pwd;
	private StudentBean studentBean;
	private StudentManager studentManager;
	// 登录结果
	private String result;
	// 查询所有学生
	private String getAll;
	
	
	// 跳转部分
	// 跳转到主页面
	public String index() {
		return "index";
	}

	// 判断登录
	public String login() {
		result = "";
		// System.out.println(studentBean.getNumber()+".."+studentBean.getPwd());
		try {
			if (studentManager.login(number, pwd)) {
				result = "success";
				studentBean = studentManager.getByStuNumber(number);
				ActionContext.getContext().getSession().put("student", studentBean);
			} else {
				result = "fail";
			}
		} catch (Exception e) {
			result = "fail";
			e.printStackTrace();
		}
		return SUCCESS;

	}

	// 退出
	public String out() {
		ActionContext.getContext().getSession().put("student", null);
		return "out";
	}
	//判断密码是否正确
	public String judgePassword(){
		Object s = ActionContext.getContext().getSession().get("student");
		if(s instanceof StudentBean){
			studentBean = (StudentBean)s;
			if(studentBean.getPwd().equals(pwd)){
				result = "success";
			}else{
				result = "fail";
			}
		}else{
			result = "fail";
		}
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

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getGetAll() {
		return getAll;
	}

	public void setGetAll(String getAll) {
		this.getAll = getAll;
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

}
