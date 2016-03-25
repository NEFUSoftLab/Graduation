package edu.nefu.gdms.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private String sid;
	private Teacher teacher;
	private String number;
	private String name;
	private String pwd;
	private String phone;
	private String sex;
	private String major;
	private String email;
	private Set titles = new HashSet(0);
	private Set papers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(Teacher teacher, String number, String name, String pwd,
			String phone, String sex, String major, String email) {
		this.teacher = teacher;
		this.number = number;
		this.name = name;
		this.pwd = pwd;
		this.phone = phone;
		this.sex = sex;
		this.major = major;
		this.email = email;
	}

	/** full constructor */
	public Student(Teacher teacher, String number, String name, String pwd,
			String phone, String sex, String major, String email, Set titles,
			Set papers) {
		this.teacher = teacher;
		this.number = number;
		this.name = name;
		this.pwd = pwd;
		this.phone = phone;
		this.sex = sex;
		this.major = major;
		this.email = email;
		this.titles = titles;
		this.papers = papers;
	}

	// Property accessors

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set getTitles() {
		return this.titles;
	}

	public void setTitles(Set titles) {
		this.titles = titles;
	}

	public Set getPapers() {
		return this.papers;
	}

	public void setPapers(Set papers) {
		this.papers = papers;
	}

}