package edu.nefu.gdms.serviceImpl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import edu.nefu.gdms.beans.TeacherBean;
import edu.nefu.gdms.beans.TitleBean;
import edu.nefu.gdms.domain.Teacher;
import edu.nefu.gdms.domain.Title;
import edu.nefu.gdms.service.TeacherManager;
import edu.nefu.gdms.service.util.FileLoaderManagerImpl;
import edu.nefu.gdms.service.util.ManagerTemplate;

public class TeacherManagerImpl extends ManagerTemplate implements TeacherManager {
	
	
	private FileLoaderManagerImpl fileUpload;

	public FileLoaderManagerImpl getFileUpload() {
		return fileUpload;
	}

	public void setFileUpload(FileLoaderManagerImpl fileUpload) {
		this.fileUpload = fileUpload;
	}

	@Override
	public boolean login(String username, String password) {
		Teacher student = teacherDao.getByNumber(username);
		if (student!=null &&  password.equals(student.getPwd()))
			return true;
		else return false;
	}

	@Override
	public void save(TeacherBean teacher) {
		teacherDao.save(new Teacher(teacher));
		
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

	@SuppressWarnings("finally")
	@Override
	public String addTitle(TitleBean titleBean,File file,String filename,String path) {
		String rs = "success";
		//1.保存论文题目到数据库
		//2.保存文件
		try{
			titleDao.save(new Title(titleBean));
			fileUpload.saveFile(file, filename,path);
		}catch(Exception e){
			rs = "fail";
		}finally{
			return rs;
		}
	}

	@Override
	public void modify(TeacherBean teacherBean) {
		teacherDao.update(new Teacher(teacherBean));
	}

	@Override
	public void updatePassword(String pwd, String teid) {
		teacherDao.updatePassword(pwd,teid);
		
	}

	
}
