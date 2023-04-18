package com.sonata.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.model.Feedback;
@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
	List<Feedback> findByideaId(int ideaId);
}
