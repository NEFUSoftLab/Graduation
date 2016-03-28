package edu.nefu.gdms.domain;

import java.util.Date;

public class Log {
	
	private String did;
	
	private String id;
	
	private String desc;
	
	private Date date;

	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Log() {
		super();
	}

	public Log(String did, String id, String desc, Date date) {
		super();
		this.did = did;
		this.id = id;
		this.desc = desc;
		this.date = date;
	}
	
	
	
	
}	
