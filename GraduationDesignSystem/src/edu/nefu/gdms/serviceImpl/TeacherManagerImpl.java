package edu.nefu.gdms.serviceImpl;

import java.util.List;

import edu.nefu.gdms.beans.TeacherBean;
import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.domain.Teacher;
import edu.nefu.gdms.service.TeacherManager;
import edu.nefu.gdms.service.util.ManagerTemplate;

public class TeacherManagerImpl extends ManagerTemplate implements TeacherManager {
	
	

	 

	@Override
	public boolean login(String username, String password) {
		Teacher student = teacherDao.getByNumber(username);
		if (student!=null &&  password.equals(student.getPwd()))
			return true;
		else return false;
	}

	@Override
	public void save(TeacherBean teacher) {
 
		
	}

	@Override
	public List<TeacherBean> getAll() {

		return null;
	}

	@Override
	public TeacherBean getByTeaNumber(String number) {
		Teacher teacher = teacherDao.getByNumber(number);
		return new TeacherBean(teacher);
	}



}
