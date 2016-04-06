package edu.nefu.gdms.dao;

import java.util.List;


import edu.nefu.gdms.domain.Title;

public interface TitleDao {
	
	Title get(String id);
	String save(Title tile);
	void update(Title title);
	void delete(Title title);
	void delete(String id);
	
	List<Title> getAll();
	
	List<Title> getByTeid(String teid);
	
	Title getBySid(String sid);
	
	List<Title> getAllBySid(String sid);

}
