package edu.nefu.gdms.action;

import java.util.List;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

import edu.nefu.gdms.beans.AdminBean;
import edu.nefu.gdms.beans.StudentBean;
import edu.nefu.gdms.service.AdminManager;
import edu.nefu.gdms.service.StudentManager;

public class AdminAction extends ActionSupport{
	Gson gson=new Gson();
	private AdminManager adminManager;
	private StudentManager studentManager;
	private AdminBean adminBean;
	
	
	
	//
	private String login;
	
	//
	private String getAllStudent;
	
	
	public StudentManager getStudentManager() {
		return studentManager;
	}
	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getGetAllStudent() {
		return getAllStudent;
	}
	public void setGetAllStudent(String getAllStudent) {
		this.getAllStudent = getAllStudent;
	}
	public AdminManager getAdminManager() {
		return adminManager;
	}
	public void setAdminManager(AdminManager adminManager) {
		this.adminManager = adminManager;
	}
	public AdminBean getAdminBean() {
		return adminBean;
	}
	public void setAdminBean(AdminBean adminBean) {
		this.adminBean = adminBean;
	}
	
	public String login(){
		login = "";
		//System.out.println(studentBean.getNumber()+".."+studentBean.getPwd());
		try{
			if (adminManager.login(adminBean.getNumber(),adminBean.getPwd())) {
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
		public String getAllStudent(){
			getAllStudent = "";
			System.out.println("yes");
			List<StudentBean> studentList = studentManager.getAll();
			getAllStudent =  gson.toJson(studentList);
			System.out.println(getAllStudent);
			return SUCCESS;
		}
		
		
		public String login_forward(){
			return "forward";
			
		}
		}
}
