package com.sonata.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Suggestion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int suggestionId;
	
	private String suggestion;
	private int ideaId;
	public Suggestion() {}
	public Suggestion(int suggestionId, String suggestion, int ideaId) {
		super();
		this.suggestionId = suggestionId;
		this.suggestion = suggestion;
		this.ideaId = ideaId;
	}
	public int getSuggestionId() {
		return suggestionId;
	}
	public void setSuggestionId(int suggestionId) {
		this.suggestionId = suggestionId;
	}
	public String getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	public int getIdeaId() {
		return ideaId;
	}
	public void setIdeaId(int ideaId) {
		this.ideaId = ideaId;
	}
	
	
	

}
