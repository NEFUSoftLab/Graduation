package edu.nefu.gdms.service.util;

import edu.nefu.gdms.dao.StudentDao;

public class ManagerTemplate {
	protected StudentDao studentDao;

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
}
