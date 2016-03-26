package edu.nefu.gdms.daoImpl;

import java.util.List;

import edu.nefu.gdms.dao.TepascoreDao;
import edu.nefu.gdms.domain.Tepascore;
import edu.nefu.gdms.support.GdmsHibernateDaoSupport;

public class TepascoreDaoHibernate extends GdmsHibernateDaoSupport implements TepascoreDao {

	@Override
	public Tepascore get(String id) {
		
		return getHibernateTemplate().get(Tepascore.class, id);
	}

	@Override
	public String save(Tepascore tepascore) {
		
		return (String)getHibernateTemplate().save(tepascore);
	}

	@Override
	public void update(Tepascore tepascore) {
		
		getHibernateTemplate().merge(tepascore);
	
		
		
	}

	@Override
	public void delete(Tepascore tepascore) {
		
		
		getHibernateTemplate().delete(tepascore);
		
	}

	@Override
	public void delete(String id) {
		
		
		Tepascore tepascore =getHibernateTemplate().get(Tepascore.class, id);
		getHibernateTemplate().delete(tepascore);
		
	}

	@Override
	public List<Tepascore> getAll() {
		String hql="from tepascore";
		return (List<Tepascore>)getHibernateTemplate().find(hql);
		
	}

}
