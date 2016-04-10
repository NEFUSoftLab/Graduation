package edu.nefu.gdms.action;

import java.util.List;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

import edu.nefu.gdms.beans.AdminBean;
import edu.nefu.gdms.beans.PageBean;
import edu.nefu.gdms.beans.StudentBean;
import edu.nefu.gdms.beans.TeacherBean;
import edu.nefu.gdms.service.AdminManager;
import edu.nefu.gdms.service.StudentManager;
import edu.nefu.gdms.service.TeacherManager;

public class AdminAction extends ActionSupport {
	Gson gson = new Gson();
	private AdminManager adminManager;
	private StudentManager studentManager;
	private TeacherManager teacherManager;

	private int page = 0;
	private TeacherBean teacherBean;

	private PageBean pagebean;

	private String number;
	private String pwd;

	private AdminBean adminBean;

	private List<TeacherBean> teacherList;

	//
	private String login;

	//
	private String getAllStudent;
	
	//
	private String getAllTeacher;

	// 跳转模块
	public String login_forward() {
		return "forward";
	}

	public String index() {
		return "index";
	}

	// 业务功能模块
	public String login() {
		login = "";
		// System.out.println(studentBean.getNumber()+".."+studentBean.getPwd());
		try {
			if (adminManager.login(number, pwd)) {
				login = "success";

			} else {
				login = "fail";
			}
		} catch (Exception e) {
			login = "fail";
			e.printStackTrace();
		}
		return SUCCESS;
	}

	// 取得所有学生数据
	public String getAllStudent() {
		getAllStudent = "";
		System.out.println("yes");
		List<StudentBean> studentList = studentManager.getAll();
		getAllStudent = gson.toJson(studentList);
		System.out.println(getAllStudent);
		return SUCCESS;
	}

	// 分页获取老师数据
	public String getAllTeacherBySize() {
		pagebean = adminManager.getAllTeacher(10, page);
		return "getAllTeacher";

	}
	public String getAllTeacher(){
		pagebean = adminManager.getAllTeacher(10, page);
		getAllTeacher = gson.toJson(pagebean);
		return SUCCESS;
	}

	// 添加老师
	public String addTeacher() {
		teacherManager.save(teacherBean);
		return "addTeacher";
	}

	// 删除老师
	public String delTeacher() {
		adminManager.delTeacher(teacherBean);
		return "delTeacher";
	}

	// 修改老师
	public String modifyTeacher() {
		teacherManager.modify(teacherBean);
		return "modifyTeacher";
	}

	public TeacherBean getTeacherBean() {
		return teacherBean;
	}

	public void setTeacherBean(TeacherBean teacherBean) {
		this.teacherBean = teacherBean;
	}

	public PageBean getPagebean() {
		return pagebean;
	}

	public void setPagebean(PageBean pagebean) {
		this.pagebean = pagebean;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public TeacherManager getTeacherManager() {
		return teacherManager;
	}

	public void setTeacherManager(TeacherManager teacherManager) {
		this.teacherManager = teacherManager;
	}

	public List<TeacherBean> getTeacherList() {
		return teacherList;
	}

	public void setTeacherList(List<TeacherBean> teacherList) {
		this.teacherList = teacherList;
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

	public String getGetAllTeacher() {
		return getAllTeacher;
	}

	public void setGetAllTeacher(String getAllTeacher) {
		this.getAllTeacher = getAllTeacher;
	}
	
	
}
