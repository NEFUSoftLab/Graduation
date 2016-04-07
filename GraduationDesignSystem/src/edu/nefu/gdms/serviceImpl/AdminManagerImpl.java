package edu.nefu.gdms.serviceImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import edu.nefu.gdms.domain.Admin;
import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.domain.Teacher;
import edu.nefu.gdms.service.AdminManager;
import edu.nefu.gdms.service.util.ManagerTemplate;

public class AdminManagerImpl extends ManagerTemplate implements AdminManager {
	
	private static final int MAX_GROUP_NUM = 5;
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
	
 




}
