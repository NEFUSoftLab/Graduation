package edu.nefu.gdms.daoImpl;

import java.util.List;

import edu.nefu.gdms.dao.AdminDao;
import edu.nefu.gdms.domain.Admin;
import edu.nefu.gdms.domain.Grour;
import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.support.GdmsHibernateDaoSupport;

public class AdminDaoHibernate extends GdmsHibernateDaoSupport implements AdminDao{

	@Override
	public Admin get(String id) {
		return getHibernateTemplate().get(Admin.class,id);
	}

	@Override
	public String save(Admin admin) {
		return (String) getHibernateTemplate().save(admin);
	}

	@Override
	public void update(Admin admin) {
		getHibernateTemplate().merge(admin);
		
	}

	@Override
	public void delete(Admin admin) {
		getHibernateTemplate().delete(admin);
		
	}

	@Override
	public void delete(String id) {
		Admin admin = getHibernateTemplate().get(Admin.class, id);
		getHibernateTemplate().delete(admin);
		
	}

	@Override
	public List<Admin> getAll() { 
		return getHibernateTemplate().find("from Admin");
	}

	@Override
	public Admin getByTeid(String teid) {
		List<Admin> list = getHibernateTemplate().find("from Admin where teid = ?",teid);
		if(list.size()!=0) 
			return list.get(0);
		else
			return null;
	}
	
	 
	
}
