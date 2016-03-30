package HibernateDaoImpTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import edu.nefu.gdms.dao.GrourDao;
import edu.nefu.gdms.dao.StudentDao;

public class LogTest {
	
	ApplicationContext ac = new FileSystemXmlApplicationContext("/WebContent/WEB-INF/applicationContext.xml"); 
	StudentDao dao = (StudentDao) ac.getBean("studentDao");
	
	GrourDao gdao = (GrourDao) ac.getBean("grourDao");
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
