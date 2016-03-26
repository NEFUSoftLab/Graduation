package ServiceImpTest;

import org.junit.Test;

import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.service.StudentManager;
import edu.nefu.gdms.serviceImpl.StudentManagerImpl;

public class StudentManagetImpTest {
	
	private StudentManager manager = new StudentManagerImpl();
	
	@Test
	public void test() {
		Student student = new Student(null, "110", "name", "110", "112", "男", "xs", "hah");
		
		manager.save(student);
	}
	
	
	

}
