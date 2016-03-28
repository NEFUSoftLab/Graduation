package edu.nefu.gdms.daoImpl;

import java.util.List;

import edu.nefu.gdms.dao.DlogDao;
import edu.nefu.gdms.domain.Dlog;
import edu.nefu.gdms.support.GdmsHibernateDaoSupport;

public class DlogDaoHibernate extends GdmsHibernateDaoSupport implements DlogDao{

	@Override
	public Dlog get(String id) {
		return getHibernateTemplate().get(Dlog.class,id);
	}

	@Override
	public String save(Dlog log) {
		return (String) getHibernateTemplate().save(log);
	}

	@Override
	public void update(Dlog log) {
		getHibernateTemplate().merge(log);
		
	}

	@Override
	public void delete(Dlog log) {
		getHibernateTemplate().delete(log);
		
	}

	@Override
	public void delete(String id) {
		Dlog log = getHibernateTemplate().get(Dlog.class, id);
		getHibernateTemplate().delete(log);	
	}
	
	@Override
	public List<Dlog> getAll() { 
		return getHibernateTemplate().find("from Dlog");
	}

	@Override
	public Dlog getById(String id) {
		
		return (Dlog) getHibernateTemplate().find("from Dlog where id = ?",id);
	}
 
}
