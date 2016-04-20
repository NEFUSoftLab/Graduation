package ServiceImpTest;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import edu.nefu.gdms.beans.PageBean;
import edu.nefu.gdms.beans.TeacherBean;
import edu.nefu.gdms.domain.Teacher;
import edu.nefu.gdms.service.AdminManager;

public class StudentManagetImpTest {
	
	
	ApplicationContext ac = new FileSystemXmlApplicationContext("/WebContent/WEB-INF/applicationContext.xml"); 
	AdminManager manager = (AdminManager)ac.getBean("adminManager");
	
	@Test
	public void test() {
		manager.quickGroup();
		
	}

}
