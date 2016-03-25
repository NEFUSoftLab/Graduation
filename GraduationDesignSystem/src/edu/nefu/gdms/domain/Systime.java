package edu.nefu.gdms.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Systime entity. @author MyEclipse Persistence Tools
 */

public class Systime implements java.io.Serializable {

	// Fields

	private String syid;
	private String name;
	private String starttime;
	private String endtime;
	private Set papers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Systime() {
	}

	/** minimal constructor */
	public Systime(String name, String starttime, String endtime) {
		this.name = name;
		this.starttime = starttime;
		this.endtime = endtime;
	}

	/** full constructor */
	public Systime(String name, String starttime, String endtime, Set papers) {
		this.name = name;
		this.starttime = starttime;
		this.endtime = endtime;
		this.papers = papers;
	}

	// Property accessors

	public String getSyid() {
		return this.syid;
	}

	public void setSyid(String syid) {
		this.syid = syid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStarttime() {
		return this.starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return this.endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public Set getPapers() {
		return this.papers;
	}

	public void setPapers(Set papers) {
		this.papers = papers;
	}

}