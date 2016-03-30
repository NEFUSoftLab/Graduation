package edu.nefu.gdms.dao;

import java.util.List;

import edu.nefu.gdms.domain.Grour;
import edu.nefu.gdms.domain.Log;

public interface LogDao {
	/*
	 * 分组，接口
	 */
	
	Log get(String did);
	
	Log getById(String id);
	
	String save(Log log);
	
	void update(Log log);
	
	void delete(Log log);
	
	void delete(String id);
	
	List<Log> getAll();
}
