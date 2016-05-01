package edu.nefu.gdms.action;

import java.util.List;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

import edu.nefu.gdms.beans.AdminBean;
import edu.nefu.gdms.beans.PageBean;
import edu.nefu.gdms.beans.StudentBean;
import edu.nefu.gdms.beans.TeacherBean;
import edu.nefu.gdms.domain.Teacher;
import edu.nefu.gdms.service.AdminManager;
import edu.nefu.gdms.service.StudentManager;
import edu.nefu.gdms.service.TeacherManager;

public class AdminAction extends ActionSupport {
	Gson gson = new Gson();
	private AdminManager adminManager;
	private StudentManager studentManager;
	private TeacherManager teacherManager;

	private int page = 1;
	private int pageSize = 10;
	

	private PageBean pagebean;
	private AdminBean adminBean;
	private TeacherBean teacherBean;
	private StudentBean studentBean;

	private String number;
	private String pwd;
	
	//Teacher Number
	private String teNumber;
	

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
	
	public String teaForward() {
		return "tea";
	}
	
	public String addTeaForward() {
		teacherBean = null;
		return "adte";
	}
	
	public String timeForward() {
		return "adtm";
	}
	
	public String index() {
		return "index";
	}
	
	public String manageTimeForward() {
		return "mangetime";
	}
	
	public String stuDistribute() {
		return "stuDistri";
	}

	public String addStuForward() {
		return "adstu";
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
		pagebean = adminManager.getAllStudent(pageSize, page);
		getAllStudent = gson.toJson(pagebean);
		return SUCCESS;
	}
	
	//添加学生
	public String addStudent(){
		studentManager.save(studentBean);
		
		return "addStudent";
		
	}
	

	// 分页获取老师数据
	public String getAllTeacherBySize() {
		pagebean = adminManager.getAllTeacher(pageSize, page);
		return "getAllTeacher";

	}
	public String getAllTeacher(){
		pagebean = adminManager.getAllTeacher(pageSize, page);
		getAllTeacher = gson.toJson(pagebean);
		return SUCCESS;
	}
	
	// 添加老师
	public String addTeacher() {
		teacherManager.save(teacherBean);
		return "addTeacher";
	}

	// 删除老师
	public void delTeacher() {
		System.out.println(teNumber);
		TeacherBean tea = teacherManager.getByTeaNumber(teNumber);
		adminManager.delTeacher(tea);
	}
	
	//删除多个学生
	public String delManaTeacher(){
		
		return null;
	}

	// 修改老师
	public String modifyTeacher() {
		System.out.println(teacherBean.getPwd());
		teacherManager.modify(teacherBean);
		return "modifyTeacher";
	}
	
	//跳转至修改老师
	public String modifyFowardTea(){
		teacherBean = teacherManager.getByTeaNumber(teNumber);
		return "modifyFowardTea";
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

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public StudentBean getStudentBean() {
		return studentBean;
	}

	public void setStudentBean(StudentBean studentBean) {
		this.studentBean = studentBean;
	}

	public String getTeNumber() {
		return teNumber;
	}

	public void setTeNumber(String teNumber) {
		this.teNumber = teNumber;
	}
	
	
}
