package HibernateDaoImpTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import edu.nefu.gdms.dao.AdminDao;
import edu.nefu.gdms.dao.StudentDao;
import edu.nefu.gdms.dao.TeacherDao;
import edu.nefu.gdms.domain.Admin;
import edu.nefu.gdms.domain.Teacher;
import edu.nefu.gdms.service.AdminManager;

public class StudentDaoImpTest {
	
 
	ApplicationContext ac = new FileSystemXmlApplicationContext("/WebContent/WEB-INF/applicationContext.xml"); 
	StudentDao dao = (StudentDao) ac.getBean("studentDao"); 
	AdminDao dao1 = (AdminDao)ac.getBean("adminDao");
	TeacherDao dao2 = (TeacherDao) ac.getBean("teacherDao");
	AdminManager manager  = (AdminManager) ac.getBean("adminManager");
	
	
	@Test
	public void test() {  
//		Log a = new Log("12","12","12","12");
//		dao.save(a);
//		System.out.println("succ");
//		for(Log d:dao.getAll()){
//			System.out.println(d);
//		}
//		Teacher teacher = dao2.getByNumber("110");
//		Admin a = new Admin();
//		a.setTeacher(teacher);
//		dao1.save(a);
		System.out.println(manager.login("110", "110"));
		
		//System.out.println(dao1.getByTeid("40289f1353d183be0153d183ce530000"));
	}
	
	
	
	
	
	

}
