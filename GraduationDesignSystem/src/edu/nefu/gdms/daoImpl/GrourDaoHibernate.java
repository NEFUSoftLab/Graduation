package edu.nefu.gdms.daoImpl;

import java.util.List;

import edu.nefu.gdms.dao.GrourDao;
import edu.nefu.gdms.domain.Grour;
import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.support.GdmsHibernateDaoSupport;

public class GrourDaoHibernate extends GdmsHibernateDaoSupport implements GrourDao{

	@Override
	public Grour get(String id) {
		return getHibernateTemplate().get(Grour.class,id);
	}

	@Override
	public String save(Grour grour) {
		return (String) getHibernateTemplate().save(grour);
	}

	@Override
	public void update(Grour grour) {
		getHibernateTemplate().merge(grour);
		
	}

	@Override
	public void delete(Grour grour) {
		getHibernateTemplate().delete(grour);
		
	}

	@Override
	public void delete(String id) {
		Grour grour = getHibernateTemplate().get(Grour.class, id);
		getHibernateTemplate().delete(grour);
		
	}

	@Override
	public List<Grour> getAll() { 
		return getHibernateTemplate().find("from Grour");
	}
	
	 
	
}
