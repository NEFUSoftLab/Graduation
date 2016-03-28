package HibernateDaoImpTest;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import edu.nefu.gdms.dao.TeacherDao;

import edu.nefu.gdms.domain.Teacher;

public class TeacherDaoImplTest {
	
	ApplicationContext ac = new FileSystemXmlApplicationContext("/WebContent/WEB-INF/applicationContext.xml"); 
	TeacherDao dao = (TeacherDao) ac.getBean("teacherDao");

	@Test
	public void test() {
		Teacher teacher = new Teacher(null, "1111111111", "111111", "111111", "111111", "111111", "111111", "111111", null);
		dao.save(teacher);
		
		
		
//		
//		List<Teacher> list=dao.getAll();
//		
//		
//	Teacher t=list.get(0);
//	System.out.println(t.getEmail());
		
		
		
	}

	
	
}
