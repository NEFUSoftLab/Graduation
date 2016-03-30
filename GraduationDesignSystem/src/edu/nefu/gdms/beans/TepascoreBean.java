package edu.nefu.gdms.beans;

import edu.nefu.gdms.domain.Tepascore;

public class TepascoreBean {
	
	
	private String id;
	private String pid;
	private String teid;
	private String score;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getTeid() {
		return teid;
	}
	public void setTeid(String teid) {
		this.teid = teid;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	
	
	public TepascoreBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public TepascoreBean(String id, String pid, String teid, String score) {
		super();
		this.id = id;
		this.pid = pid;
		this.teid = teid;
		this.score = score;
	}
	
	public TepascoreBean(Tepascore tepascore) {
		super();
		this.id=tepascore.getId();
		this.pid=tepascore.getPaper().getPid();
		this.teid=tepascore.getTeacher().getTeid();
		this.score=tepascore.getScore();
	}
	
	
	
	
	

}
