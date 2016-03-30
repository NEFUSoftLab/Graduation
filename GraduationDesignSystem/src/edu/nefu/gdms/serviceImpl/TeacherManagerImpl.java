package edu.nefu.gdms.serviceImpl;

import java.util.List;

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
	public void save(Teacher teacher) {
		teacherDao.save(teacher);
	}

	@Override
	public List<Teacher> getAll() {
		return teacherDao.getAll();
	}

}
