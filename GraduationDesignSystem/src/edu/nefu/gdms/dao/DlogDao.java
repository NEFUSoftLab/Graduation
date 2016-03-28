package edu.nefu.gdms.dao;

import java.util.List;

import edu.nefu.gdms.domain.Grour;
import edu.nefu.gdms.domain.Dlog;

public interface DlogDao {
	/*
	 * 分组，接口
	 */
	
	Dlog get(String did);
	
	Dlog getById(String id);
	
	String save(Dlog log);
	
	void update(Dlog log);
	
	void delete(Dlog log);
	
	void delete(String id);
	
	List<Dlog> getAll();
}
