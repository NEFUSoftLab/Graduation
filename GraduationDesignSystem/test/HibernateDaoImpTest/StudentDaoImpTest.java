package HibernateDaoImpTest;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import edu.nefu.gdms.dao.StudentDao;
import edu.nefu.gdms.daoImpl.StudentDaoHibernate;
import edu.nefu.gdms.domain.Student;

public class StudentDaoImpTest {
	
	ApplicationContext ac = new FileSystemXmlApplicationContext("applicationContext.xml"); 
	StudentDao dao = (StudentDao) ac.getBean("studentDao");
	
	
	
	@Test
	public void test() {
		Student student = new Student(null, "110", "name", "110", "112", "男", "xs", "hah");
		dao.save(student);
	}
	
	
	

}
