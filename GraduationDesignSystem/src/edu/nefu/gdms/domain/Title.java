package edu.nefu.gdms.domain;

/**
 * Title entity. @author MyEclipse Persistence Tools
 */

public class Title implements java.io.Serializable {

	// Fields

	private String tid;
	private Student student;
	private Teacher teacher;
	private String tname;
	private String filepath;
	private String status;

	// Constructors

	/** default constructor */
	public Title() {
	}

	/** full constructor */
	public Title(Student student, Teacher teacher, String tname,
			String filepath, String status) {
		this.student = student;
		this.teacher = teacher;
		this.tname = tname;
		this.filepath = filepath;
		this.status = status;
	}

	// Property accessors

	public String getTid() {
		return this.tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getTname() {
		return this.tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getFilepath() {
		return this.filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}