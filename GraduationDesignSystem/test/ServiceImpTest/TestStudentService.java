package ServiceImpTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import edu.nefu.gdms.beans.StudentBean;
import edu.nefu.gdms.service.StudentManager;

public class TestStudentService {
	public static void main(String[] args) {
		ApplicationContext ac = new FileSystemXmlApplicationContext("/WebContent/WEB-INF/applicationContext.xml"); 
		StudentManager manager = (StudentManager)ac.getBean("studentManager");
		StudentBean student = new StudentBean(null, "11000000", "na1me1111111", "110", "112", "男", "xs", "hah","12");
		try{
		manager.save(student);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("awqwewqe");
	}
}
