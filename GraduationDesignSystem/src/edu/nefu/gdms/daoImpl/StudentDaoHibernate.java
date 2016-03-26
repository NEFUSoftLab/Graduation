package edu.nefu.gdms.daoImpl;

import java.util.List;

import edu.nefu.gdms.dao.StudentDao;
import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.support.GdmsHibernateDaoSupport;

public class StudentDaoHibernate extends GdmsHibernateDaoSupport implements StudentDao{

	@Override
	public Student get(String id) {
		return getHibernateTemplate().get(Student.class,id);
	}

	@Override
	public String save(Student student) {
		return (String) getHibernateTemplate().save(student);
	}

	@Override
	public void update(Student student) {
		getHibernateTemplate().merge(student);
		
	}

	@Override
	public void delete(Student student) {
		getHibernateTemplate().delete(student);
		
	}

	@Override
	public void delete(String id) {
		Student student = getHibernateTemplate().get(Student.class, id);
		getHibernateTemplate().delete(student);
		
	}

	@Override
	public List<Student> getAll() { 
		return    getHibernateTemplate().find("from Student");
	}
 
	
	
}
