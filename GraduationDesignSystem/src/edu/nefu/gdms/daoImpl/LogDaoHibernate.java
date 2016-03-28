package edu.nefu.gdms.daoImpl;

import java.util.List;

import edu.nefu.gdms.dao.LogDao;
import edu.nefu.gdms.domain.Log;
import edu.nefu.gdms.support.GdmsHibernateDaoSupport;

public class LogDaoHibernate extends GdmsHibernateDaoSupport implements LogDao{

	@Override
	public Log get(String id) {
		return getHibernateTemplate().get(Log.class,id);
	}

	@Override
	public String save(Log log) {
		return (String) getHibernateTemplate().save(log);
	}

	@Override
	public void update(Log log) {
		getHibernateTemplate().merge(log);
		
	}

	@Override
	public void delete(Log log) {
		getHibernateTemplate().delete(log);
		
	}

	@Override
	public void delete(String id) {
		Log log = getHibernateTemplate().get(Log.class, id);
		getHibernateTemplate().delete(log);	
	}
	
	@Override
	public List<Log> getAll() { 
		return getHibernateTemplate().find("from Log");
	}

	@Override
	public Log getById(String id) {
		
		return (Log) getHibernateTemplate().find("from Log where id = ?",id);
	}
 
}
