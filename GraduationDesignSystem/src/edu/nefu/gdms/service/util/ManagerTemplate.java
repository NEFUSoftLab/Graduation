package edu.nefu.gdms.service.util;

import edu.nefu.gdms.dao.AdminDao;
import edu.nefu.gdms.dao.GrourDao;
import edu.nefu.gdms.dao.LogDao;
import edu.nefu.gdms.dao.PaperDao;
import edu.nefu.gdms.dao.StudentDao;
import edu.nefu.gdms.dao.SystimeDao;
import edu.nefu.gdms.dao.TeacherDao;
import edu.nefu.gdms.dao.TepascoreDao;
import edu.nefu.gdms.dao.TitleDao;

public class ManagerTemplate {
	protected StudentDao studentDao;
	protected GrourDao grourDao;
	protected PaperDao paperDao;
	protected SystimeDao systimeDao;
	protected TeacherDao teacherDao;
	protected TitleDao titleDao;
	protected TepascoreDao tepascoreDao;
	protected LogDao logDao;
	protected AdminDao  adminDao;
	
	
	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public GrourDao getGrourDao() {
		return grourDao;
	}

	public void setGrourDao(GrourDao grourDao) {
		this.grourDao = grourDao;
	}

	public PaperDao getPaperDao() {
		return paperDao;
	}

	public void setPaperDao(PaperDao paperDao) {
		this.paperDao = paperDao;
	}

	public SystimeDao getSystimeDao() {
		return systimeDao;
	}

	public void setSystimeDao(SystimeDao systimeDao) {
		this.systimeDao = systimeDao;
	}

	public TeacherDao getTeacherDao() {
		return teacherDao;
	}

	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	public TitleDao getTitleDao() {
		return titleDao;
	}

	public void setTitleDao(TitleDao titleDao) {
		this.titleDao = titleDao;
	}

	public TepascoreDao getTepascoreDao() {
		return tepascoreDao;
	}

	public void setTepascoreDao(TepascoreDao tepascoreDao) {
		this.tepascoreDao = tepascoreDao;
	}

	public LogDao getLogDao() {
		return logDao;
	}

	public void setLogDao(LogDao logDao) {
		this.logDao = logDao;
	}
	
	
	
	
}
