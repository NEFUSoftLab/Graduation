package HibernateDaoImpTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import edu.nefu.gdms.dao.LogDao;
import edu.nefu.gdms.domain.Log;

public class StudentDaoImpTest {
	
	/*
	 * DyxTest
	 * 
	 * 
	 */
	
	ApplicationContext ac = new FileSystemXmlApplicationContext("/WebContent/WEB-INF/applicationContext.xml"); 
	LogDao dao = (LogDao) ac.getBean("logDao"); 
	
	
	
	@Test
	public void test() { 
		Log a = new Log("1111112","12","12","12");
		dao.save(a);
		System.out.println("succ");
		for(Log d:dao.getAll()){
			System.out.println(d);
		}
	}
	
	
	
	
	
	

}
