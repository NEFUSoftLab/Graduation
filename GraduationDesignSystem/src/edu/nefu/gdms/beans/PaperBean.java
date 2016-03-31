package edu.nefu.gdms.beans;

import edu.nefu.gdms.domain.Paper;

public class PaperBean {
	
	private String pid;
	private String sid;
	private String syid;
	private String filepath;
	private String score;
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSyid() {
		return syid;
	}
	public void setSyid(String syid) {
		this.syid = syid;
	}
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public PaperBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PaperBean(String pid, String sid, String syid, String filepath, String score) {
		super();
		this.pid = pid;
		this.sid = sid;
		this.syid = syid;
		this.filepath = filepath;
		this.score = score;
	}
	
	public PaperBean(Paper paper) {
		super();
		this.pid=paper.getPid();
		this.sid=paper.getStudent().getSid();
		this.syid=paper.getSystime().getSyid();
		this.filepath=paper.getFilepath();
		this.score=paper.getScore();
		
		
	}
	
	

}
