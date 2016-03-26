package ServiceImpTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.service.StudentManager;
import edu.nefu.gdms.serviceImpl.StudentManagerImpl;

public class StudentManagetImpTest {
	
	
	ApplicationContext ac = new FileSystemXmlApplicationContext("applicationContext.xml"); 
	StudentManager manager = (StudentManager)ac.getBean("studentManager");
	
	@Test
	public void test() {
		Student student = new Student(null, "110", "name", "110", "112", "男", "xs", "hah");
		
		manager.save(student);
	}
	
	
	

}
