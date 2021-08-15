package com.manuanand.courses;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String name;

	private String description;

	private String category;

	private String subCategory;
	
	private double priceInUSD;
	
	// Derived fields
	private String instructor;

	private int numModules;

	private double hoursToComplete;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public double getHoursToComplete() {
		return hoursToComplete;
	}

	public void setHoursToComplete(double hoursToComplete) {
		this.hoursToComplete = hoursToComplete;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public double getPriceInUSD() {
		return priceInUSD;
	}

	public void setPriceInUSD(double priceInUSD) {
		this.priceInUSD = priceInUSD;
	}

	public int getNumModules() {
		return numModules;
	}

	public void setNumModules(int numModules) {
		this.numModules = numModules;
	}
	
}
