package edu.nefu.gdms.daoImpl;

import java.util.List;

import edu.nefu.gdms.dao.TeacherDao;
import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.domain.Teacher;
import edu.nefu.gdms.support.GdmsHibernateDaoSupport;

public class TeacherDaoHibernate extends GdmsHibernateDaoSupport implements TeacherDao {

	@Override
	public Teacher get(String id) {
		
		return getHibernateTemplate().get(Teacher.class, id);
	}

	@Override
	public String save(Teacher teacher) {
		
		return (String)getHibernateTemplate().save(teacher);
	}

	@Override
	public void update(Teacher teacher) {
		getHibernateTemplate().merge(teacher);
		
	}

	@Override
	public void delete(Teacher teacher) {
		
		getHibernateTemplate().delete(teacher);
	}

	@Override
	public void delete(String id) {
		
		Teacher teacher=getHibernateTemplate().get(Teacher.class, id);
		getHibernateTemplate().delete(teacher);
	}


	

	@Override
	public List<Teacher> getAll() {
		
		String hql = "from Teacher";
		return (List<Teacher>) getHibernateTemplate().find(hql);
		
	}

	@Override
	public Teacher getByNumber(String number) {
		List<Teacher> list = getHibernateTemplate().find("from Teacher where number = ?",number);
		if(list.size()!=0) 
			return list.get(0);
		else
			return null;
	}

}
