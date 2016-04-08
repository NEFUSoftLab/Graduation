package edu.nefu.gdms.serviceImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import edu.nefu.gdms.beans.StudentBean;
import edu.nefu.gdms.beans.TeacherBean;
import edu.nefu.gdms.domain.Admin;
import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.domain.Teacher;
import edu.nefu.gdms.service.AdminManager;
import edu.nefu.gdms.service.util.ManagerTemplate;

public class AdminManagerImpl extends ManagerTemplate implements AdminManager {
	
	private  int MAX_GROUP_NUM = 0;
	Random random = new Random();
	
	
	@Override
	public boolean login(String username, String password) {
		Teacher teacher = teacherDao.getByNumber(username); 
		if (teacher!=null &&  password.equals(teacher.getPwd())){ 
			Admin admin = adminDao.getByTeid(teacher.getTeid()); 
			if(admin!=null){
				return true;
			}
			else{
				return false;
			}
		}
		else 
			return false;
	}
	@Override
	public void quickGroup() {
		List<Student> stuList = studentDao.getAll();
		List<Teacher> teaList = teacherDao.getAll();
		MAX_GROUP_NUM = (int) Math.ceil((double)stuList.size()/(double)teaList.size());
		//用于存放已经被分组的学生的序号
		Set<Integer> numSet = new HashSet<Integer>();
		int stuNum = 0;
		int index = 0;
		for(Teacher tea:teaList){
			while(numSet.contains(index)){
				index = random.nextInt(stuList.size()-1);
			}
			numSet.add(index);
			while(stuNum<MAX_GROUP_NUM){
				Student stu = stuList.get(index);
				stu.setTeacher(tea);
				studentDao.update(stuList.get(index));
			}
		}
	}
	@Override
	public void setTeacher(StudentBean student, TeacherBean teacher) {
		Student stu = studentDao.getByNumber(student.getNumber());
		Teacher tea = teacherDao.getByNumber(teacher.getNumber());
		stu.setTeacher(tea);
		studentDao.update(stu);
	}
	@Override
	public void delTeacher(TeacherBean teacher) {
		teacherDao.delete(teacher.getTeid());
		
	}
	@Override
	public void addTeacher(TeacherBean teacherBean) {
		teacherDao.save(new Teacher(teacherBean));
	}
	


}
