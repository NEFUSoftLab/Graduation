package edu.nefu.gdms.action;

import java.io.File;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.nefu.gdms.beans.StudentBean;
import edu.nefu.gdms.beans.TeacherBean;
import edu.nefu.gdms.beans.TitleBean;
import edu.nefu.gdms.service.TeacherManager;

public class TeacherAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private TeacherManager teacherManager;

	// 从前台获取的文件
	private String number;
	private String pwd;
	private TeacherBean teacherBean;
	private String result;
	private TitleBean titleBean;

	// 上传的文件，文件的名字
	private File file;
	private String filename;

	// 需要传回前台的文件
	private String addTitle;
	
	
	//json
	private String getAllTeacher;

	// 登陆
	public String login() {
		result = "";
		try {
			if (teacherManager.login(number, pwd)) {
				result = "success";
				teacherBean = teacherManager.getByTeaNumber(number);
				ActionContext.getContext().getSession().put("teacher", teacherBean);
			} else {
				result = "fail";
			}

		} catch (Exception e) {
			result = "fail";
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	//判断密码是否正确
	public String judgePassword(){
		result = "";
		Object s = ActionContext.getContext().getSession().get("teacher");
		if(s instanceof TeacherBean){
			teacherBean = (TeacherBean)s;
			if(teacherBean.getPwd().equals(pwd)){
				result = "success";
			}else{
				result = "fail";
			}
		}else{
			result = "fail";
		}
		return SUCCESS;
	}
	//修改密码
	public String updatePassword(){
		result = "";
		Object s = ActionContext.getContext().getSession().get("teacher");
		if(s instanceof TeacherBean){
			teacherBean = (TeacherBean)s;
			try {
				teacherManager.updatePassword(pwd,teacherBean.getTeid());
				result = "success";
			}catch(Exception e){
				result = "系统出错！";
				e.printStackTrace();
			}
		}else{
			result = "修改失败！";
		}
		return SUCCESS;
	}
	// 跳转到主页面
	public String index() {
		return "index";
	}

	// 退出
	public String out() {
		ActionContext.getContext().getSession().put("teacher", null);
		return "out";
	}
	//跳转到我的论题模块
	public String getMyTitle(){
		return "te_title";
	}

	public String addTitle(TitleBean titleBean) {
		addTitle = teacherManager.addTitle(titleBean, file, filename,teacherBean.getNumber());
		return SUCCESS;
	}

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

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public TeacherManager getTeacherManager() {
		return teacherManager;
	}

	public void setTeacherManager(TeacherManager teacherManager) {
		this.teacherManager = teacherManager;
	}

	public String getGetAllTeacher() {
		return getAllTeacher;
	}

	public void setGetAllTeacher(String getAllTeacher) {
		this.getAllTeacher = getAllTeacher;
	}
	
	
	
}
