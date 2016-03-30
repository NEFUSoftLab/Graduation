package edu.nefu.gdms.dao;


import java.util.List;

import edu.nefu.gdms.domain.Teacher;

public interface TeacherDao {
	
	Teacher get(String id);
	String save(Teacher teacher);
	
	void update(Teacher teacher);
	
	void delete(Teacher teacher);
	
	void delete(String id);
	
	List<Teacher> getAll();
	
	Teacher getByNumber(String number);

}
