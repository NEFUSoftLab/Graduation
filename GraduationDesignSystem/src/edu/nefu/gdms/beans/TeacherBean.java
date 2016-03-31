package edu.nefu.gdms.beans;

import edu.nefu.gdms.domain.Teacher;

public class TeacherBean {

	private String teid;
	private String number;
	private String name;
	private String phone;
	private String pwd;
	private String email;
	private String major;
	private String level;
	private String gid;

	public String getTeid() {
		return teid;
	}

	public void setTeid(String teid) {
		this.teid = teid;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public TeacherBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeacherBean(String teid, String number, String name, String phone, String pwd, String email, String major,
			String level, String gid) {
		super();
		this.teid = teid;
		this.number = number;
		this.name = name;
		this.phone = phone;
		this.pwd = pwd;
		this.email = email;
		this.major = major;
		this.level = level;
		this.gid = gid;
	}

	public TeacherBean(Teacher teacher) {
		super();
		this.teid = teacher.getTeid();
		this.number = teacher.getNumber();
		this.name = teacher.getName();
		this.phone = teacher.getPhone();
		this.pwd = teacher.getPwd();
		this.email = teacher.getMajor();
		this.major = teacher.getMajor();
		this.level = teacher.getLevel();
		this.gid = teacher.getGroup().getGid();
	}

}
