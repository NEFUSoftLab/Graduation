package ServiceImpTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import edu.nefu.gdms.beans.StudentBean;
import edu.nefu.gdms.service.StudentManager;

public class StudentManagetImpTest {
	
	
	ApplicationContext ac = new FileSystemXmlApplicationContext("/WebContent/WEB-INF/applicationContext.xml"); 
	StudentManager manager = (StudentManager)ac.getBean("studentManager");
	
	@Test
	public void test() {
		StudentBean student = new StudentBean(null, "11000000", "na1me111111", "110", "112", "男", "xs", "hah","12");
		
		manager.save(student);
		System.out.println("awqwewqe");
		
		
		
		
		
	}
	
	
	

}
