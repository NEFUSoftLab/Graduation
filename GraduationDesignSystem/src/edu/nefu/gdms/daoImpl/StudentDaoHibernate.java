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
	public String save(Student student){
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

	@Override
	public Student getByNumber(String number) { 
		List<Student> list = getHibernateTemplate().find("from Student where number = ?",number);
		if(list.size()!=0) 
			return list.get(0);
		else
			return null;
	}

	@Override
	public void updatePassword(String pwd, String sid) {
		Student student = getHibernateTemplate().get(Student.class, sid);
		student.setPwd(pwd);
		getHibernateTemplate().update(student);
	}
}
