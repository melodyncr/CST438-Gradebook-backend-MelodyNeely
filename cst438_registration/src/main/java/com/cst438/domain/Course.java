package com.cst438.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	private int course_id;
	private int year1;
	private String semester;
	private int section;
	private String title;
	private String times;
	private String building;
	private String room;
	private String instructor;
	private Date start;
	private Date end1;
	
	public Course() {
		super();
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public int getYear() {
		return year1;
	}

	public void setYear(int year) {
		this.year1 = year;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTimes() {
		return times;
	}

	public void setTimes(String times) {
		this.times = times;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end1;
	}

	public void setEnd(Date end) {
		this.end1 = end;
	}

	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", year=" + year1 + ", semester=" + semester + ", section=" + section
				+ ", title=" + title + ", times=" + times + ", building=" + building + ", room=" + room
				+ ", instructor=" + instructor + ", start=" + start + ", end=" + end1 + "]";
	}

}
