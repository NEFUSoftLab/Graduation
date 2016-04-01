package edu.nefu.gdms.serviceImpl;

import edu.nefu.gdms.dao.AdminDao;
import edu.nefu.gdms.domain.Admin;
import edu.nefu.gdms.domain.Teacher;
import edu.nefu.gdms.service.AdminManager;
import edu.nefu.gdms.service.util.ManagerTemplate;

public class AdminManagerImpl extends ManagerTemplate implements AdminManager {

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
	
	
 




}
