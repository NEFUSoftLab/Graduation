package edu.nefu.gdms.daoImpl;

import java.util.List;

import edu.nefu.gdms.dao.PaperDao;
import edu.nefu.gdms.domain.Grour;
import edu.nefu.gdms.domain.Paper;
import edu.nefu.gdms.support.GdmsHibernateDaoSupport;

public class PaperDaoHibernate extends GdmsHibernateDaoSupport implements PaperDao{

	@Override
	public Paper get(String id) {
		return getHibernateTemplate().get(Paper.class,id);
	}

	@Override
	public String save(Paper paper) {
		return (String) getHibernateTemplate().save(paper);
	}

	@Override
	public void update(Paper paper) {
		getHibernateTemplate().merge(paper);
		
	}

	@Override
	public void delete(Paper paper) {
		getHibernateTemplate().delete(paper);
		
	}

	@Override
	public void delete(String id) {
		Paper paper = getHibernateTemplate().get(Paper.class, id);
		getHibernateTemplate().delete(paper);	
	}
	
	@Override
	public List<Paper> getAll() { 
		return getHibernateTemplate().find("from Paper");
	}
}
