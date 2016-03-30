package edu.nefu.gdms.dao;

import java.util.List;

import edu.nefu.gdms.domain.Paper;

public interface PaperDao {
	
	Paper get(String id);
	
	
	String save(Paper paper);
	
	void update(Paper paper);
	
	void delete(Paper paper);
	
	void delete(String id);
	
	List<Paper> getAll();
}	
