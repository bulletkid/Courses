package com.manuanand.courses;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Module {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private Integer courseId;
	
	private String title;
	
	private String uri;
	
	private Double hoursToComplete;
	
	@ElementCollection
	private List<String> instructors = new ArrayList<String>();
	 
	private String comments;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public Double getHoursToComplete() {
		return hoursToComplete;
	}

	public void setHoursToComplete(Double hoursToComplete) {
		this.hoursToComplete = hoursToComplete;
	}

	public List<String> getInstructors() {
		return instructors;
	}

	public void setInstructors(List<String> instructors) {
		this.instructors = instructors;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
}