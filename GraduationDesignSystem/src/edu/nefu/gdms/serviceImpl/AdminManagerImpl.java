package edu.nefu.gdms.serviceImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import edu.nefu.gdms.beans.PageBean;
import edu.nefu.gdms.beans.StudentBean;
import edu.nefu.gdms.beans.TeacherBean;
import edu.nefu.gdms.domain.Admin;
import edu.nefu.gdms.domain.Grour;
import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.domain.Teacher;
import edu.nefu.gdms.service.AdminManager;
import edu.nefu.gdms.service.util.ManagerTemplate;

public class AdminManagerImpl extends ManagerTemplate implements AdminManager {
	
	private  int MAX_GROUP_NUM = 0;
	
	
	
	private int TEA_EVERY_GROUP = 3;
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
			while(stuNum<MAX_GROUP_NUM){
				while(numSet.contains(index)){
					index = random.nextInt(stuList.size()-1);
				}
				numSet.add(index);
				Student stu = stuList.get(index);
				stu.setTeacher(tea);
				studentDao.update(stuList.get(index));
				stuNum++;
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
	
	
	@Override
	public void addGroup() {
		List<Teacher> teaList = teacherDao.getAll();
		int size = (teaList.size()+TEA_EVERY_GROUP-1) / TEA_EVERY_GROUP;
		Grour[] array = new Grour[size];
		Set<Integer> set = new HashSet<Integer>();
		int index = 0;
		int max_group = 0;
		for(int i=0;i<size;i++){
			array[i].setNumber(i+"");
			grourDao.save(array[i]);
			while(max_group<TEA_EVERY_GROUP)
				while(set.contains(i)){
					index = random.nextInt(size);
				}
				set.add(index);
				teaList.get(index).setGroup(array[i]);
				max_group++;
				teacherDao.update(teaList.get(index));
		}
	}
	
	
	@Override
	public void setGroupForTea(String number, String name) {
		Teacher teacher = teacherDao.getByNumber(number);
		Grour grour = grourDao.getByNumber(name);
		teacher.setGroup(grour);
		teacherDao.update(teacher);
	}
	
	
	@Override
	public PageBean getAllTeacher(int pageSize, int page) {
		
		PageBean pageBean = new PageBean();
		int allRows = teacherDao.getAll().size();
		int totalPage = pageBean.getTotalPages(pageSize, allRows);
        int currentPage = pageBean.getCurPage(page);
        int offset = pageBean.getCurrentPageOffset(pageSize, currentPage);
        
        List teacherList = teacherDao.getAllTeacherByPage(offset, pageSize);
        pageBean.setList(teacherList);
        pageBean.setAllRows(allRows);
        pageBean.setCurrentPage(currentPage);
        pageBean.setTotalPage(totalPage);
        
        return pageBean;
	}
	@Override
	public PageBean getAllStudent(int pageSize, int page) {
		PageBean pageBean = new PageBean();
		int allRows = studentDao.getAll().size();
		int totalPage = pageBean.getTotalPages(pageSize, allRows);
        int currentPage = pageBean.getCurPage(page);
        int offset = pageBean.getCurrentPageOffset(pageSize, currentPage);
        
        List studentList = studentDao.getAllStudentByPage(offset, pageSize);
        pageBean.setList(studentList);
        pageBean.setAllRows(allRows);
        pageBean.setCurrentPage(currentPage);
        pageBean.setTotalPage(totalPage);
        
        return pageBean;
	}
	
	
	


}
