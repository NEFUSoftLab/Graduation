package edu.nefu.gdms.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import edu.nefu.gdms.beans.StudentBean;
import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.service.StudentManager;
import edu.nefu.gdms.service.util.ManagerTemplate;

public class StudentManagerImpl extends ManagerTemplate implements StudentManager {
	
	

	 

	@Override
	public boolean login(String username, String password) {
		Student student = studentDao.getByNumber(username); 
		if (student!=null &&  password.equals(student.getPwd()))
			return true;
		else 
			return false;
	}

	

	@Override
	public List<StudentBean> getAll() {
		List<Student> list = studentDao.getAll();
		List<StudentBean> listRs = new ArrayList<StudentBean>();
		for(Student student:list){
			listRs.add(new StudentBean(student));
		}
		
		return listRs;
	}



	@Override
	public String save(String number, String name, String pwd, String phone, String sex, String major, String email) {
		
		 return studentDao.save(new Student(null, number, name, pwd, phone, sex, major, email));
		
	}



	@Override
	public String setTeacher(String studentNumber, String teacherNumber) {
		try{
			Student student = studentDao.getByNumber(studentNumber);
			student.setTeacher(teacherDao.getByNumber(teacherNumber));
			studentDao.update(student);
			return "success";
		}
		catch(Exception e){
			e.printStackTrace();
			return "fail";
		}
	}




}
