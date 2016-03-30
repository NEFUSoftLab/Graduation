package edu.nefu.gdms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.nefu.gdms.dao.StudentDao;
import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.service.StudentManager;
import edu.nefu.gdms.service.util.ManagerTemplate;

public class StudentManagerImpl extends ManagerTemplate implements StudentManager {
	
	

	 

	@Override
	public boolean login(String username, String password) {
		Student student = studentDao.getByNumber(username);
		if (student!=null &&  password.equals(student.getPwd()))
			return true;
		else return false;
	}

	@Override
	public void save(Student student) {
		studentDao.save(student);
	}

	@Override
	public List<Student> getAll() {
		
		return studentDao.getAll();
	}

}
