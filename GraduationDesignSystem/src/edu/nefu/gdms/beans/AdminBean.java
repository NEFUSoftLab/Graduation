package edu.nefu.gdms.beans;

public class AdminBean {
	private  String pwd;
	private String number;
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public AdminBean(String pwd, String number) {
		super();
		this.pwd = pwd;
		this.number = number;
	}
	public AdminBean() {
		super();
	}
	
	
	
	
	
	
}
