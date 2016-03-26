package edu.nefu.gdms.daoImpl;

import java.util.List;

import edu.nefu.gdms.dao.SystimeDao;
import edu.nefu.gdms.domain.Grour;
import edu.nefu.gdms.domain.Systime;
import edu.nefu.gdms.support.GdmsHibernateDaoSupport;

public class SystimeDaoHibernate extends GdmsHibernateDaoSupport implements SystimeDao{

	@Override
	public Systime get(String id) {
		return getHibernateTemplate().get(Systime.class,id);
	}

	@Override
	public String save(Systime systime) {
		return (String) getHibernateTemplate().save(systime);
	}

	@Override
	public void update(Systime systime) {
		getHibernateTemplate().merge(systime);
		
	}

	@Override
	public void delete(Systime systime) {
		getHibernateTemplate().delete(systime);
		
	}

	@Override
	public void delete(String id) {
		Systime systime = getHibernateTemplate().get(Systime.class, id);
		getHibernateTemplate().delete(systime);
		
	}
	
	@Override
	public List<Systime> getAll() { 
		return getHibernateTemplate().find("from Systime");
	}
	
}
