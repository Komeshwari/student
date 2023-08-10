package com.stu.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
@Table(name="Student_Details2")
public class StudentD{
@Id
private Integer stdId;
private String stdName;
private String stdEmail;
private String course;
private long courseFees;

public Integer getStdId() {
	return stdId;
}

public void setStdId(Integer stdId) {
	this.stdId = stdId;
}

public String getStdName() {
	return stdName;
}

public void setStdName(String stdName) {
	this.stdName = stdName;
}

public String getStdEmail() {
	return stdEmail;
}

public void setStdEmail(String stdEmail) {
	this.stdEmail = stdEmail;
}

public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}

public long getCourseFees() {
	return courseFees;
}

public void setCourseFees(long courseFees) {
	this.courseFees = courseFees;
}

@Override
public String toString() {
	return "StudentD [stdId=" + stdId + ", stdName=" + stdName + ", stdEmail=" + stdEmail + ", course=" + course
			+ ", courseFees=" + courseFees + "]";
}

public StudentD(Integer stdId, String stdName, String stdEmail, String course, long courseFees) {
	super();
	this.stdId = stdId;
	this.stdName = stdName;
	this.stdEmail = stdEmail;
	this.course = course;
	this.courseFees = courseFees;
}
public StudentD() {
	
}



}
