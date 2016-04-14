package edu.nefu.gdms.beans;

import edu.nefu.gdms.domain.Log;

public class LogBean {

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

	public String getCdate() {
		return cdate;
	}

	public void setCdate(String cdate) {
		this.cdate = cdate;
	}

	public LogBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LogBean(String did, String id, String cdesc, String cdate) {
		super();
		this.did = did;
		this.id = id;
		this.cdesc = cdesc;
		this.cdate = cdate;
	}

	public LogBean(Log log) {
		super();
		this.did=log.getDid();
		this.id=log.getId();
		this.cdesc=log.getCdesc();
		this.cdate=log.getCdate();
	}

}
