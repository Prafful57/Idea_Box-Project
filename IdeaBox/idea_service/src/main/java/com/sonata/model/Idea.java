package com.sonata.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ideas")
public class Idea {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int ideaId;
	
	private String ideaTitle;
	private String ideaDescription;
	private String tags;
	private String submittedDate;
	private int empId;
	private int likes;
	private String ideaStatus;
	
	
	public Idea() {}
	
	

	public Idea(int ideaId, String ideaTitle, String ideaDescription, String tags, String submittedDate, int empId,
			int likes, String ideaStatus) {
		super();
		this.ideaId = ideaId;
		this.ideaTitle = ideaTitle;
		this.ideaDescription = ideaDescription;
		this.tags = tags;
		this.submittedDate = submittedDate;
		this.empId = empId;
		this.likes = likes;
		this.ideaStatus = ideaStatus;
	}



	public int getIdeaId() {
		return ideaId;
	}

	public void setIdeaId(int ideaId) {
		this.ideaId = ideaId;
	}

	public String getIdeaTitle() {
		return ideaTitle;
	}

	public void setIdeaTitle(String ideaTitle) {
		this.ideaTitle = ideaTitle;
	}

	public String getIdeaDescription() {
		return ideaDescription;
	}

	public void setIdeaDescription(String ideaDescription) {
		this.ideaDescription = ideaDescription;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(String submittedDate) {
		this.submittedDate = submittedDate;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public String getIdeaStatus() {
		return ideaStatus;
	}

	public void setIdeaStatus(String ideaStatus) {
		this.ideaStatus = ideaStatus;
	}



		
	
	
}
