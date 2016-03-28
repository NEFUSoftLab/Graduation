package edu.nefu.gdms.dao;

import java.util.List;

import edu.nefu.gdms.domain.Tepascore;

public interface TepascoreDao {
	
	Tepascore get(String id);
	
	String save(Tepascore tepascore);
	
	void update(Tepascore tepascore);
	
	void delete(Tepascore tepascore);
	
	void delete(String id);
	
	List<Tepascore> getAll();

}
