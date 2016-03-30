package HibernateDaoImpTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import edu.nefu.gdms.dao.StudentDao;
import edu.nefu.gdms.domain.Log;

public class StudentDaoImpTest {
	
	/*
	 * DyxTest
	 * 
	 * 
	 */
	
	ApplicationContext ac = new FileSystemXmlApplicationContext("/WebContent/WEB-INF/applicationContext.xml"); 
	StudentDao dao = (StudentDao) ac.getBean("studentDao"); 
	
	
	
	@Test
	public void test() { 
//		Log a = new Log("12","12","12","12");
//		dao.save(a);
//		System.out.println("succ");
//		for(Log d:dao.getAll()){
//			System.out.println(d);
//		}
		System.out.println(dao.getByNumber("110"));
	}
	
	
	
	
	
	

}
