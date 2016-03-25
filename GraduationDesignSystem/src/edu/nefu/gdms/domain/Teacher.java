package edu.nefu.gdms.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public class Teacher implements java.io.Serializable {

	// Fields

	private String teid;
	private Group group;
	private String number;
	private String name;
	private String phone;
	private String pwd;
	private String email;
	private String major;
	private String level;
	private Set tepascores = new HashSet(0);
	private Set students = new HashSet(0);
	private Set titles = new HashSet(0);

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** minimal constructor */
	public Teacher(Group group, String number, String name, String phone,
			String pwd, String email, String major, String level) {
		this.group = group;
		this.number = number;
		this.name = name;
		this.phone = phone;
		this.pwd = pwd;
		this.email = email;
		this.major = major;
		this.level = level;
	}

	/** full constructor */
	public Teacher(Group group, String number, String name, String phone,
			String pwd, String email, String major, String level,
			Set tepascores, Set students, Set titles) {
		this.group = group;
		this.number = number;
		this.name = name;
		this.phone = phone;
		this.pwd = pwd;
		this.email = email;
		this.major = major;
		this.level = level;
		this.tepascores = tepascores;
		this.students = students;
		this.titles = titles;
	}

	// Property accessors

	public String getTeid() {
		return this.teid;
	}

	public void setTeid(String teid) {
		this.teid = teid;
	}

	public Group getGroup() {
		return this.group;
	}

	public void setGroup(Group group) {
		this.group = group;
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

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Set getTepascores() {
		return this.tepascores;
	}

	public void setTepascores(Set tepascores) {
		this.tepascores = tepascores;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

	public Set getTitles() {
		return this.titles;
	}

	public void setTitles(Set titles) {
		this.titles = titles;
	}

}