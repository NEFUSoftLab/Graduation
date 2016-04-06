package edu.nefu.gdms.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import edu.nefu.gdms.beans.StudentBean;
import edu.nefu.gdms.domain.Log;
import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.service.StudentManager;
import edu.nefu.gdms.service.util.ManagerTemplate;
import javafx.scene.input.DataFormat;

public class StudentManagerImpl extends ManagerTemplate implements StudentManager {

	@Override
	public boolean login(String username, String password) {
		Student student = studentDao.getByNumber(username);
		if (student != null && password.equals(student.getPwd()))
			return true;
		else
			return false;
	}

	@Override
	public List<StudentBean> getAll() {
		List<Student> list = studentDao.getAll();
		List<StudentBean> listRs = new ArrayList<StudentBean>();
		for (Student student : list) {
			listRs.add(new StudentBean(student));
		}

		return listRs;
	}

	@Override
	public String save(StudentBean studentBean) {
		String rs = studentDao.save(new Student(null, studentBean.getNumber(), studentBean.getName(), studentBean.getPwd(),
					studentBean.getPhone(), studentBean.getSex(), studentBean.getMajor(), studentBean.getEmail()));
		logDao.save(new Log("", studentBean.getNumber(), "创建新用户", dateFormat.format(now))); 
		return rs;

	}

	@Override
	public String setTeacher(String studentNumber, String teacherNumber) {
		try {
			Student student = studentDao.getByNumber(studentNumber);
			student.setTeacher(teacherDao.getByNumber(teacherNumber));
			studentDao.update(student);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "fail";
		}
	}

	@Override
	public void modify(StudentBean studentBean) {
		Student student = studentDao.getByNumber(studentBean.getNumber());
		student.setName(studentBean.getName());
		student.setPwd(studentBean.getPwd());
		student.setPhone(studentBean.getPhone());
		student.setSex(studentBean.getSex());
		student.setMajor(studentBean.getMajor());
		student.setEmail(studentBean.getEmail());
		studentDao.update(student);

	}

	@Override
	public void remove(String sid) {
		studentDao.delete(sid);

	}

	@Override
	public StudentBean getBySid(String sid) {
		Student student = studentDao.get(sid);
		StudentBean studentBean = new StudentBean(student);
		return studentBean;
	}

	@Override
	public StudentBean getByStuNumber(String number) {
		Student student = studentDao.getByNumber(number);
		StudentBean studentBean = new StudentBean(student);
		return studentBean;
	}

}
