package com.sonata.repository;

import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sonata.model.Idea;
@Repository
public interface IdeaRepository extends JpaRepository<Idea, Integer> {
	List<Idea> findByIdeaStatus(String string);

	List<Idea> findByTags(String tags);

	List<Idea> findBySubmittedDate(String dates);

	List<Idea> findByLikes(int likes);


	
	
}
