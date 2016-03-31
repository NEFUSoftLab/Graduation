package edu.nefu.gdms.beans;

import edu.nefu.gdms.domain.Grour;

public class GrourBean {
	private String gid;
	private String name;

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
		// TODO Auto-generated constructor stub
	}

	public GrourBean(String gid, String name) {
		super();
		this.gid = gid;
		this.name = name;
	}

	public GrourBean(Grour group) {
		super();
		this.gid = group.getGid();
		this.name = group.getName();
	}

}
