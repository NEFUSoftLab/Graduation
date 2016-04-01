package edu.nefu.gdms.action;

import java.util.List;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.nefu.gdms.beans.StudentBean;
import edu.nefu.gdms.service.StudentManager;

public class StudentAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Gson gson=new Gson();
	
	private StudentBean studentBean;
	 
	
	

	public StudentBean getStudentBean() {
		return studentBean;
	}
	public void setStudentBean(StudentBean studentBean) {
		this.studentBean = studentBean;
	}


	private StudentManager studentManager;
	//登录结果
	private String login;  
	//查询所有学生
	private String getAll;
	
	private String save;
	
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

	//判断登录
	public String login() {
		login = "";
		//System.out.println(studentBean.getNumber()+".."+studentBean.getPwd());
		try{
			if (studentManager.login(studentBean.getNumber(),studentBean.getPwd())) {
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
	
	
	public String save() {
		save = "";
		try{
			studentManager.save(studentBean.getNumber(), studentBean.getName(), studentBean.getPwd(), 
					studentBean.getPhone(),studentBean.getSex(),studentBean.getMajor(),studentBean.getEmail());
			save="success";
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	
	
	public String modify() {
		try {
			studentManager.modify(studentBean);
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return SUCCESS;
	}
	
	
	public String remove() {
		try {
			studentManager.remove(studentBean.getSid());
		}catch (Exception e){
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
}
