package edu.nefu.gdms.action;

import java.io.File;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.nefu.gdms.beans.TeacherBean;
import edu.nefu.gdms.beans.TitleBean;
import edu.nefu.gdms.service.TeacherManager;

public class TeacherAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TeacherManager teacherManager;
	
	//从前台获取的文件
	private String number;
	private String pwd;
	private TeacherBean teacherBean;
	private String login; 
	private TitleBean titleBean;
	
	
	//上传的文件，文件的名字
	private File file;
	private String filename;
	
	//需要传回前台的文件
	private String addTitle;
	
	
	
	
	public String getAddTitle() {
		return addTitle;
	}
	public void setAddTitle(String addTitle) {
		this.addTitle = addTitle;
	}
	public TitleBean getTitleBean() {
		return titleBean;
	}
	public void setTitleBean(TitleBean titleBean) {
		this.titleBean = titleBean;
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
	
	

	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
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
	
	
	public String addTitle(TitleBean titleBean){
		addTitle = teacherManager.addTitle(titleBean, file, filename);
		return SUCCESS;
	}
}
