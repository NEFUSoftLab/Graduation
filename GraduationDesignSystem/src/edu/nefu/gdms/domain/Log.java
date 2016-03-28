package edu.nefu.gdms.domain;

import java.util.Date;

public class Log {
	
	private String did;
	
	private String id;
	
	private String cdesc;
	
	private String cdate;

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
 

	public Log() {
		super();
	}

	public Log(String did, String id, String cdesc, String cdate) {
		super();
		this.did = did;
		this.id = id;
		this.cdesc = cdesc;
		this.cdate = cdate;
	}

	public String getCdate() {
		return cdate;
	}

	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	
	
	
	
}	
