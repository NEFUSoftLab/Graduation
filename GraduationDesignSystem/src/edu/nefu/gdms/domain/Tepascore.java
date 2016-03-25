package edu.nefu.gdms.domain;

/**
 * Tepascore entity. @author MyEclipse Persistence Tools
 */

public class Tepascore implements java.io.Serializable {

	// Fields

	private String id;
	private Paper paper;
	private Teacher teacher;
	private String score;

	// Constructors

	/** default constructor */
	public Tepascore() {
	}

	/** full constructor */
	public Tepascore(Paper paper, Teacher teacher, String score) {
		this.paper = paper;
		this.teacher = teacher;
		this.score = score;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Paper getPaper() {
		return this.paper;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getScore() {
		return this.score;
	}

	public void setScore(String score) {
		this.score = score;
	}

}