package com.sonata;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sonata.model.Feedback;
import com.sonata.repository.FeedbackRepository;

@SpringBootTest
class FeedbackServiceApplicationTests {

	@Autowired
	private FeedbackRepository feedbackRepository;
	
	@Test
	public void getFeedbackTest() {
		Feedback fb=feedbackRepository.findById(2).get();
		Assertions.assertThat(fb.getFeedBackId()).isEqualTo(2);
	}
	
    @Test
    public void saveEventTest() {
        Feedback fb1=new Feedback();
        fb1.setFeedBackId(100);
        fb1.setFeedBack("good");
        fb1.setIdeaId(100);

        feedbackRepository.save(fb1);
         Assertions.assertThat(fb1.getFeedBackId()).isGreaterThan(0);         
    }

 

    @Test
    public void deleteFeedbackTest() {
        Feedback fb=feedbackRepository.findById(20).get();
        feedbackRepository.delete(fb);

 

        Feedback fb1 = null;
        Optional<Feedback> listFeedback=feedbackRepository.findById(20);

 

        if(listFeedback.isPresent()) {
            fb1 = listFeedback.get();

 

        }

 

        Assertions.assertThat(fb1).isNull();
    }

}

