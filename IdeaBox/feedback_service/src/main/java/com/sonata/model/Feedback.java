package com.sonata.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import jakarta.persistence.Transient;

@Entity
@Table
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int feedBackId;
	
	private int ideaId;
	private String feedBack;
	
	public Feedback() {};
	public Feedback(int feedBackId, int ideaId, String feedBack) {
		super();
		this.feedBackId = feedBackId;
		this.ideaId = ideaId;
		this.feedBack = feedBack;
	}
	public int getFeedBackId() {
		return feedBackId;
	}
	public void setFeedBackId(int feedBackId) {
		this.feedBackId = feedBackId;
	}
	public int getIdeaId() {
		return ideaId;
	}
	public void setIdeaId(int ideaId) {
		this.ideaId = ideaId;
	}
	public String getFeedBack() {
		return feedBack;
	}
	public void setFeedBack(String feedaBack) {
		this.feedBack = feedaBack;
	}
	
	
	
	

}
