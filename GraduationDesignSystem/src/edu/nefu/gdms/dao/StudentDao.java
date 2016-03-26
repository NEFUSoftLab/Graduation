package edu.nefu.gdms.dao;

import java.util.List;
 
import edu.nefu.gdms.domain.Student;

public interface StudentDao {
	
	Student get(String id);
	
	
	String save(Student student);
	
	void update(Student student);
	
	void delete(Student student);
	
	void delete(String id);
	
	List<Student> getAll();
	
}	
