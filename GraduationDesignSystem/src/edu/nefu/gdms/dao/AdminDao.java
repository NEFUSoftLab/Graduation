package edu.nefu.gdms.dao;

import java.util.List;

import edu.nefu.gdms.domain.Admin;
import edu.nefu.gdms.domain.Grour;

public interface AdminDao {
	/*
	 * 分组，接口
	 */
	
	Admin get(String id);
	
	Admin getByTeid(String teid);
	
	String save(Admin admin);
	
	void update(Admin admin);
	
	void delete(Admin admin);
	
	void delete(String id);
	
	List<Admin> getAll();
	
	
}
