package HibernateDaoImpTest;

import static org.junit.Assert.fail;

import org.junit.Test;

import edu.nefu.gdms.dao.StudentDao;
import edu.nefu.gdms.daoImpl.StudenDaoHibernate;
import edu.nefu.gdms.domain.Student;

public class StudentDaoImpTest {
	StudentDao dao = new StudenDaoHibernate();
	
	
	
	@Test
	public void test() {
		Student student = new Student(null, "110", "name", "110", "112", "男", "xs", "hah");
		dao.save(student);
	}
	
	
	

}
