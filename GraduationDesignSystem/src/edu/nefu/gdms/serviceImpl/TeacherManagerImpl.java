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
	public String addTitle(TitleBean titleBean,File file,String filename,TeacherBean teacherBean) {
		String rs = "success";
		//1.保存论文题目到数据库
		//2.保存文件
		try{
			String filepath = fileUpload.saveFile(file, filename,teacherBean.getNumber());
			if(!filepath.equals("fail")){
				titleBean.setFilepath(filepath);
				titleBean.setTeid(teacherBean.getTeid());
				Title tit = new Title(titleBean);
				tit.setTeacher(teacherDao.get(teacherBean.getTeid()));
				titleDao.save(tit);
				
			}else{
				rs = "fail";
			}
		}catch(Exception e){
			rs = "fail";
		}finally{
			return rs;
		}
	}

	@Override
	public void modify(TeacherBean teacherBean) {
		Teacher teacher = new Teacher(teacherBean);
		teacherDao.update(teacher);
	}

	@Override
	public void updatePassword(String pwd, String teid) {
		teacherDao.updatePassword(pwd,teid);
		
	}

	
}
