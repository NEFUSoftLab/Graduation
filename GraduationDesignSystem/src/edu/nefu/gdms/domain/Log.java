package edu.nefu.gdms.domain;

import java.util.Date;

public class Log {
	
	private String did;
	
	private String id;
	
	private String cdesc;
	
	private Date cdate;

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



	

	public String getCdesc() {
		return cdesc;
	}

	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}

	public Date getCdate() {
		return cdate;
	}

	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}

	public Log() {
		super();
	}

	public Log(String did, String id, String cdesc, Date cdate) {
		super();
		this.did = did;
		this.id = id;
		this.cdesc = cdesc;
		this.cdate = cdate;
	}
	
	
	
	
}	
