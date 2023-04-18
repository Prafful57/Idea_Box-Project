package com.sonata.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.sonata.model.Suggestion;

import com.sonata.repository.SuggestionRepository;

import jakarta.transaction.Transactional;
@Service
public class SuggestionServiceImp {
	
	@Autowired
	private SuggestionRepository suggestionRepository;
	
	//create
	public Suggestion saveSuggestion(Suggestion sg,int ideaId) {
		sg.setIdeaId(ideaId);
		return suggestionRepository.save(sg);
		
	}
	
	//delete suggestion
	public void deletSuggestionById(int suggestionId) {
		suggestionRepository.deleteById(suggestionId);	
	}
	
	//get list of suggestions related to one ideaId
	public List<Suggestion> getAllSuggestions(int ideaId) {
		
		return suggestionRepository.findByideaId(ideaId);
	}

	

}
