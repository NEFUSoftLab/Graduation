package edu.nefu.gdms.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionSupport;

import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.service.StudentManager;
import net.sf.json.JSONObject;

public class StudentAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	private String username;
//	private String password;
	private HttpServletRequest request;
	private StudentManager studentManager;
	private String result;

	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}
	
	public void setServletRequest(HttpServletRequest arg0) {
        this.request = arg0;
    }

	public StudentManager getStudentManager() {
		return studentManager;
	}
	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
	}

	public String login() {
		System.out.println("123");
		try{
			String number = request.getParameter("number");
			String pwd = request.getParameter("pwd");
			System.out.println(number);
			Map<String,Object> map = new HashMap<String,Object>();
            map.put("number", 123);
            map.put("pwd",456);
            JSONObject json = JSONObject.fromObject(map);//将map对象转换成json类型数据
//			if (studentManager.login(number, pwd)) {
//				result = json.toString();
//				return SUCCESS;
//			}
            result = json.toString();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
		
	}
	
	public String getAll(){
		List<Student> studentList = studentManager.getAll();
		return "studentList";
	}


	
}
