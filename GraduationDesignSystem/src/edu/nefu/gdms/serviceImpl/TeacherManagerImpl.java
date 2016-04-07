package edu.nefu.gdms.serviceImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

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
		List<Teacher> list = teacherDao.getAll();
		List<TeacherBean> listRs = new ArrayList<TeacherBean>();
		for(Teacher teacher : list) {
			listRs.add(new TeacherBean(teacher));
		}
		return listRs;
	}

	@Override
	public TeacherBean getByTeaNumber(String number) {
		Teacher teacher = teacherDao.getByNumber(number);
		return new TeacherBean(teacher);
	}

	



}
