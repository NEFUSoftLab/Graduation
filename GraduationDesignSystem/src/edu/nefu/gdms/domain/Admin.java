package edu.nefu.gdms.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Group entity. @author MyEclipse Persistence Tools
 */

public class Admin implements java.io.Serializable {

	private String id;
	private Teacher teacher;
	
	
	public Admin() {
		super();
	}
	public Admin(String id) {
		super();
		this.id = id;
	}
	public Admin(String id, Teacher teacher) {
		super();
		this.id = id;
		this.teacher = teacher;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	

}