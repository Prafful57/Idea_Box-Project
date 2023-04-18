package com.sonata;


import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sonata.model.Suggestion;
import com.sonata.repository.SuggestionRepository;

@SpringBootTest
class SuggestionServiceApplicationTests {
	
	@Autowired
    private SuggestionRepository suggestionRepository;

 

    @Test
    public void getSuggestionTest() {
    	Suggestion sug=suggestionRepository.findById(7899).get();
         Assertions.assertThat(sug.getSuggestionId()).isEqualTo(7899);
    }

    @Test
    public void saveEventTest() {
    	Suggestion sugg=new Suggestion();
    	sugg.setSuggestionId(88);
        sugg.setSuggestion("good");
        sugg.setIdeaId(10);
       
        suggestionRepository.save(sugg);
         Assertions.assertThat(sugg.getSuggestionId()).isGreaterThan(0);         
    }

    @Test
    public void deleteSuggestionTest() {
    	Suggestion su=suggestionRepository.findById(5).get();
    	suggestionRepository.delete(su);

    	Suggestion su1 = null;
        Optional<Suggestion> listSuggestion=suggestionRepository.findById(5);

        if(listSuggestion.isPresent()) {
           su1 = listSuggestion.get();

        }

        Assertions.assertThat(su1).isNull();
    }
}
