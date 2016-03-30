package edu.nefu.gdms.dao;

import java.util.List;

import edu.nefu.gdms.domain.Systime;

public interface SystimeDao {
	/*
	 * 分组，接口
	 */
	
	Systime get(String id);
	
	String save(Systime systime);
	
	void update(Systime systime);
	
	void delete(Systime systime);
	
	void delete(String id);
	
	List<Systime> getAll();
}
