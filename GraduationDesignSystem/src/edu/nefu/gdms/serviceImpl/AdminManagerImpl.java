package edu.nefu.gdms.serviceImpl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import edu.nefu.gdms.beans.GrourBean;
import edu.nefu.gdms.beans.PageBean;
import edu.nefu.gdms.beans.StudentBean;
import edu.nefu.gdms.beans.SystimeBean;
import edu.nefu.gdms.beans.TeacherBean;
import edu.nefu.gdms.domain.Admin;
import edu.nefu.gdms.domain.Grour;
import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.domain.Systime;
import edu.nefu.gdms.domain.Teacher;
import edu.nefu.gdms.service.AdminManager;
import edu.nefu.gdms.service.util.ManagerTemplate;

public class AdminManagerImpl extends ManagerTemplate implements AdminManager {

	private int MAX_GROUP_NUM = 0;
 

	@Override
	public boolean login(String username, String password) {
		Teacher teacher = teacherDao.getByNumber(username);
		if (teacher != null && password.equals(teacher.getPwd())) {
			Admin admin = adminDao.getByTeid(teacher.getTeid());
			if (admin != null) {
				return true;
			} else {
				return false;
			}
		} else
			return false;
	}

	//学生随机分配老师
	@Override
	public void quickGroup() {
		List<Student> stuList = studentDao.getAll();
		List<Teacher> teaList = teacherDao.getAll();
		MAX_GROUP_NUM = (int) Math.ceil((double) stuList.size() / (double) teaList.size());
		Set<Student> set = new HashSet<Student>();
		for (Student student : stuList) {
			set.add(student);
		}
		int index = 0;
		for (Student student : set) {
			if (index >= teaList.size())
				index = 0;
			Teacher teacher = teaList.get(index);
			student.setTeacher(teacher);
			studentDao.update(student);
			index++;
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

	//老师随机分组
	@Override
	public void addGroup(int groupNum) {
		List<Teacher> teaList = teacherDao.getAll();
		int size = (teaList.size() + groupNum - 1) / groupNum;
		List<Grour> grourList = grourDao.getAll();
		Set<Integer> set = new HashSet<Integer>();
		int index = 0;
		for(Teacher teacher:teaList){
			if(index >= size) index = 0;
			teacher.setGroup(grourList.get(index));
			index ++;
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
	
	
	//增加系统时间
	@Override
	public void addSystime(SystimeBean systime) {
		systimeDao.save(new Systime(systime));
	}
	
	
	//修改系统时间
	@Override
	public void updateSystime(SystimeBean systimeBean) {
		Systime systime = new Systime(systimeBean);
		systime.setSyid(systimeBean.getSyid());
		systimeDao.update(systime);
	}

	@Override
	public void delSystime(SystimeBean systimeBean) {
		Systime systime = new Systime(systimeBean);
		systime.setSyid(systimeBean.getSyid());
		systimeDao.delete(systime);
		
	}

	//增加组别
	@Override
	public void addGrour(int num) {
		Grour[] array = new Grour[num];
		for(int i =0;i<num;i++){
			grourDao.save(array[i]);
		}
	}

	//增加组别
	@Override
	public void updateGrour(GrourBean grourBean) {
		Grour grour = new Grour(grourBean);
		grour.setGid(grourBean.getGid());
		grourDao.update(grour);
	}

	//删除组别
	@Override
	public void delGrour(GrourBean grourBean) {
		Grour grour = new Grour(grourBean);
		grour.setGid(grourBean.getGid());
		grourDao.delete(grour);
	}
	
	
	
}
