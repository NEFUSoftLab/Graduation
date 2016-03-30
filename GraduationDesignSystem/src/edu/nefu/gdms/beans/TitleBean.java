package edu.nefu.gdms.beans;

import edu.nefu.gdms.domain.Title;

public class TitleBean {
	
	private String tid;
	private String sid;
	private String teid;
	private String tname;
	private String filepath;
	private String status;
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getTeid() {
		return teid;
	}
	public void setTeid(String teid) {
		this.teid = teid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	public TitleBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public TitleBean(String tid, String sid, String teid, String tname, String filepath, String status) {
		super();
		this.tid = tid;
		this.sid = sid;
		this.teid = teid;
		this.tname = tname;
		this.filepath = filepath;
		this.status = status;
	}
	
	
	public TitleBean(Title title) {
		super();
		this.tid = title.getTid();
		this.sid = title.getStudent().getSid();
		this.teid = title.getTeacher().getTeid();
		this.tname = title.getTname();
		this.filepath = title.getFilepath();
		this.status = title.getStatus();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
