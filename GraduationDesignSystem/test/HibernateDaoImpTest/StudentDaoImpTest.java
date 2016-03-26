package HibernateDaoImpTest;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import edu.nefu.gdms.dao.GrourDao;
import edu.nefu.gdms.dao.StudentDao;
import edu.nefu.gdms.domain.Grour;
import edu.nefu.gdms.domain.Student;

public class StudentDaoImpTest {
	
	/*
	 * DyxTest
	 * 
	 * 
	 */
	
	ApplicationContext ac = new FileSystemXmlApplicationContext("/WebContent/WEB-INF/applicationContext.xml"); 
	StudentDao dao = (StudentDao) ac.getBean("studentDao");
	
	GrourDao gdao = (GrourDao) ac.getBean("grourDao");
	
	
	
	@Test
	public void test() {
//		Student student = new Student(null, "110", "name", "110", "112", "鐢�", "xs", "hah");
//		dao.save(student);
//		System.out.println("helli");
		//dao.save(student);
		List<Student> list = dao.getAll();
		for(Student s:list){
			System.out.println(s.getSid());
			s.setEmail("1@qq.com");
			dao.update(s);
		}
	}
	
	@Test
	public void test1() {
		Grour g = new Grour("yizu");
		gdao.save(g);
	}
	
	
	
	

}
