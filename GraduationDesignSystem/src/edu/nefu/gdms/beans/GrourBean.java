package edu.nefu.gdms.beans;

import edu.nefu.gdms.domain.Grour;

public class GrourBean {
	private String gid;
	private String name;
	private String number;

	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GrourBean() {
		super();
	}

	 

	public GrourBean(String gid, String name, String number) {
		super();
		this.gid = gid;
		this.name = name;
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public GrourBean(Grour group) {
		super();
		this.gid = group.getGid();
		this.name = group.getName();
	}

}
