package edu.nefu.gdms.daoImpl;

import java.util.List;

import edu.nefu.gdms.dao.TitleDao;
import edu.nefu.gdms.domain.Teacher;
import edu.nefu.gdms.domain.Title;
import edu.nefu.gdms.support.GdmsHibernateDaoSupport;

public class TitleDaoHibernate extends GdmsHibernateDaoSupport implements TitleDao {

	@Override
	public Title get(String id) {
		
		return getHibernateTemplate().get(Title.class, id);
	}

	@Override
	public String save(Title tile) {
		
		return (String)getHibernateTemplate().save(tile);
	}

	@Override
	public void update(Title title) {
		getHibernateTemplate().merge(title);
		
	}

	@Override
	public void delete(Title title) {
		
		getHibernateTemplate().delete(title);
		
	}

	@Override
	public void delete(String id) {
		
		
		Title title=getHibernateTemplate().get(Title.class, id);
		getHibernateTemplate().delete(title);
		
	}

	@Override
	public List<Title> getAll() {
		
		String hql = "from Title";
		return (List<Title>) getHibernateTemplate().find(hql);
	}
	

}
