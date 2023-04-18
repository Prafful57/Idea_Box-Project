package com.sonata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sonata.model.Idea;
import com.sonata.repository.IdeaRepository;
import com.sonata.service.implementation.IdeaServiceImp;

@SpringBootTest
public class IdeaServiceApplicationTests {

	@Autowired
    private IdeaRepository IdeaRepo; //instance of OrderRepositoty

    @Test
    public void getIdeaTest() {

    	Idea idea =IdeaRepo.findById(2).get();
        Assertions.assertThat(idea.getIdeaId()).isEqualTo(2);


    }
    @Test
    public void postEventTest() {
    	Idea idd= new	Idea();  
    	idd.setIdeaTitle("Ideabox");
         idd.setIdeaDescription("To post ideas");
    	 idd.setTags("@Sonata");
    	 idd.setSubmittedDate("12/12/2023");
         idd.setEmpId(23456);
    	idd.setLikes(0);
    	 idd.setIdeaStatus("submitted");
    	

    	 IdeaRepo.save(idd);
         Assertions.assertThat(idd.getIdeaId()).isGreaterThan(0);         
    }

 

    @Test
    public void deleteIdeaTest() {
//        Idea idea=IdeaRepo.findById(52).get();
//        IdeaRepo.delete(idea);

 

        Idea idea1 = null;
        Optional<Idea> listIdea=IdeaRepo.findById(52);

 

        if(listIdea.isPresent()) {
            idea1 = listIdea.get();

  }

        Assertions.assertThat(idea1).isNull();
    }

    
//    @Test
//    public void testUpdateCourses() {
//    	
//    	IdeaServiceImp service = new IdeaServiceImp();
//    	
//    Idea course = new Idea(253, "Online Consultation", "online free consultation for Adults ", "@Sonatians", "24/12/2022",12345,0,"submitted");
//    service.saveIdea(course);
//
//     course.setIdeaTitle("Ideabox");
//     course.setIdeaDescription("To post ideas");
//     course.setTags("@Sonata");
//     course.setSubmittedDate("12/12/2023");
//     course.setEmpId(23456);
//     course.setLikes(0);
//     course.setIdeaStatus("submitted");
//	 IdeaServiceImp result = (IdeaServiceImp) service.getByTags(course.getTags());
//    assertEquals(course, result);
    }



