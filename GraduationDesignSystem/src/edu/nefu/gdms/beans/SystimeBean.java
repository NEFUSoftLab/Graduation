package edu.nefu.gdms.beans;

import edu.nefu.gdms.domain.Systime;

public class SystimeBean {
	private String syid;
	private String name;
	private String starttime;
	private String endtime;
	public String getSyid() {
		return syid;
	}
	public void setSyid(String syid) {
		this.syid = syid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public SystimeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SystimeBean(String syid, String name, String starttime, String endtime) {
		super();
		this.syid = syid;
		this.name = name;
		this.starttime = starttime;
		this.endtime = endtime;
	}
	
	public SystimeBean(Systime systime) {
		super();
		this.syid=systime.getSyid();
		this.name=systime.getName();
		this.starttime=systime.getStarttime();
		this.endtime=systime.getEndtime();
	}
}
