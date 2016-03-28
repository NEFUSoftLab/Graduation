package edu.nefu.gdms.domain;

import java.util.Date;

public class Dlog {
	
	private String did;
	
	private String id;
	
	private String desc;
	
	private String date;

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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Dlog(String did, String id, String desc, String date) {
		super();
		this.did = did;
		this.id = id;
		this.desc = desc;
		this.date = date;
	}

	public Dlog() {
		super();
	}
 
	
	
	
	
}	
