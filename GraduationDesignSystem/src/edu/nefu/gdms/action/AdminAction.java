package edu.nefu.gdms.action;

import com.opensymphony.xwork2.ActionSupport;

import edu.nefu.gdms.beans.AdminBean;
import edu.nefu.gdms.service.AdminManager;

public class AdminAction extends ActionSupport{
	private AdminManager adminManager;
	private AdminBean adminBean;
	
	//
	private String login;
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
}
