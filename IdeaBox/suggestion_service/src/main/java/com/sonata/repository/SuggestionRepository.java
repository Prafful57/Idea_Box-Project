package com.sonata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.model.Suggestion;
@Repository
public interface SuggestionRepository extends JpaRepository<Suggestion, Integer> {

	

	List<Suggestion> findByideaId(int ideaId);

}
