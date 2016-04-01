package edu.nefu.gdms.beans;

import edu.nefu.gdms.domain.Student;

public class StudentBean {
	private String sid;
	private String teid;
	private String number;
	private String pwd;
	private String name;
	private String phone;
	private String sex;
	private String major;
	private String email;

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

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

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentBean(String sid, String teid, String number, String pwd, String name, String phone, String sex,
			String major, String email) {
		super();
		this.sid = sid;
		this.teid = teid;
		this.number = number;
		this.pwd = pwd;
		this.name = name;
		this.phone = phone;
		this.sex = sex;
		this.major = major;
		this.email = email;
	}

	public StudentBean(Student student) {
		super();
		this.sid = student.getSid();
		this.teid = student.getTeacher().getTeid();
		this.number = student.getNumber();
		this.pwd = student.getPwd();
		this.name = student.getName();
		this.phone = student.getPhone();
		this.sex = student.getSex();
		this.major = student.getMajor();
		this.email = student.getEmail();
	}

}
