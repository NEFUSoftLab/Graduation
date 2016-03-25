package edu.nefu.gdms.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Paper entity. @author MyEclipse Persistence Tools
 */

public class Paper implements java.io.Serializable {

	// Fields

	private String pid;
	private Student student;
	private Systime systime;
	private String filepath;
	private String score;
	private Set tepascores = new HashSet(0);

	// Constructors

	/** default constructor */
	public Paper() {
	}

	/** minimal constructor */
	public Paper(Student student, Systime systime, String filepath, String score) {
		this.student = student;
		this.systime = systime;
		this.filepath = filepath;
		this.score = score;
	}

	/** full constructor */
	public Paper(Student student, Systime systime, String filepath,
			String score, Set tepascores) {
		this.student = student;
		this.systime = systime;
		this.filepath = filepath;
		this.score = score;
		this.tepascores = tepascores;
	}

	// Property accessors

	public String getPid() {
		return this.pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Systime getSystime() {
		return this.systime;
	}

	public void setSystime(Systime systime) {
		this.systime = systime;
	}

	public String getFilepath() {
		return this.filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String getScore() {
		return this.score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public Set getTepascores() {
		return this.tepascores;
	}

	public void setTepascores(Set tepascores) {
		this.tepascores = tepascores;
	}

}