package edu.nefu.gdms.serviceImpl;

import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.service.StudentManager;
import edu.nefu.gdms.service.util.ManagerTemplate;

public class StudentManagerImpl extends ManagerTemplate implements StudentManager {

	private String password;
	private String username;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public StudentManagerImpl() {
		super();
	}

	public StudentManagerImpl(String password, String username) {
		super();
		this.password = password;
		this.username = username;
	}

	@Override
	public boolean login(String username, String password) {
		if (username.equals(this.username) && password.equals(this.password))
			return true;
		return false;

	}

	@Override
	public void save(Student student) {
		
		studentDao.save(student);
	}

}
