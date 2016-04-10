package edu.nefu.gdms.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Group entity. @author MyEclipse Persistence Tools
 */

public class Grour implements java.io.Serializable {

	// Fields

	private String gid;
	private String name;
	private String number;
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	private Set teachers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Grour() {
	}

	/** minimal constructor */
	


	public Grour(String gid, String name, String number) {
		super();
		this.gid = gid;
		this.name = name;
		this.number = number;
	}

	// Property accessors

	public String getGid() {
		return this.gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getTeachers() {
		return this.teachers;
	}

	public void setTeachers(Set teachers) {
		this.teachers = teachers;
	}

}