package HibernateDaoImpTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import edu.nefu.gdms.dao.DlogDao;
import edu.nefu.gdms.domain.Dlog;

public class StudentDaoImpTest {
	
	/*
	 * DyxTest
	 * 
	 * 
	 */
	
	ApplicationContext ac = new FileSystemXmlApplicationContext("/WebContent/WEB-INF/applicationContext.xml"); 
	DlogDao dao = (DlogDao) ac.getBean("logDao"); 
	
	
	
	@Test
	public void test() { 
		Dlog a = new Dlog("12","12","12","12");
		dao.save(a);
		System.out.println("succ");
		for(Dlog d:dao.getAll()){
			System.out.println(d);
		}
	}
	
	
	
	
	
	

}
