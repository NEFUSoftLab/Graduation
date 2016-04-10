package edu.nefu.gdms.dao;

import java.util.List;

import edu.nefu.gdms.domain.Grour;

public interface GrourDao {
	/*
	 * 分组，接口
	 */
	
	Grour get(String id);
	
	String save(Grour grour);
	
	void update(Grour grour);
	
	void delete(Grour grour);
	
	void delete(String id);
	
	List<Grour> getAll();
	
	Grour getByNumber(String number);
	
}
