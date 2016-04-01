package JsonTest;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import edu.nefu.gdms.dao.StudentDao;
import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.support.Jsontool;


public class Jsontest {
	
	
	ApplicationContext ac = new FileSystemXmlApplicationContext("/WebContent/WEB-INF/applicationContext.xml"); 
	StudentDao dao = (StudentDao) ac.getBean("studentDao");
	
	
	
	//Map<String,Object> map=new HashMap<String,Object>();
	
	@Test
	public void test() {
		
		//
		
		
		//System.out.println(jt.toJson(list));
		
		
		
		
		
		
		
		
		
	}

}
