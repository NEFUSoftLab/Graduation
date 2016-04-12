package JsonTest;

import org.apache.poi.ss.formula.functions.T;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import edu.nefu.gdms.dao.StudentDao;


public class Jsontest {
	
	
	ApplicationContext ac = new FileSystemXmlApplicationContext("/WebContent/WEB-INF/applicationContext.xml"); 
	StudentDao dao = (StudentDao) ac.getBean("studentDao");
	
	
	
	//Map<String,Object> map=new HashMap<String,Object>();
	
	@Test
	public void test() {
		
	
		
		
		
		
		
		
		
		
	}
	
	
}
