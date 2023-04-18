package com.sonata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.model.Suggestion;
import com.sonata.repository.SuggestionRepository;
import com.sonata.service.implementation.SuggestionServiceImp;

@RestController
@RequestMapping("/suggestion")
@CrossOrigin(origins="http://localhost:4200")
public class SuggestionController {
	
	
	@Autowired
	private SuggestionServiceImp suggestionServiceImpl;
	
	//create suggestion
	@PostMapping("/{ideaId}")
	public ResponseEntity<Suggestion>createEmployee(@RequestBody Suggestion suggestion,@PathVariable int ideaId){
		Suggestion sg1=suggestionServiceImpl.saveSuggestion(suggestion,ideaId);
		return ResponseEntity.status(HttpStatus.CREATED).body(sg1);
		
	}
	
	//get employee by ideaId from db
	@GetMapping("/{ideaId}")
	public List<Suggestion> getSuggestions(@PathVariable int ideaId) {
			return suggestionServiceImpl.getAllSuggestions(ideaId);
	}
	
	
	//delete suggestion
	@DeleteMapping("/{suggestionId}")
	public void deleteEmployee(@PathVariable int suggestionId ) {
		suggestionServiceImpl.deletSuggestionById(suggestionId);
	}

	

}
