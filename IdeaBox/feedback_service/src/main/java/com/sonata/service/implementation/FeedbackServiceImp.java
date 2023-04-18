package com.sonata.service.implementation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sonata.model.Feedback;
import com.sonata.repository.FeedbackRepository;

 

 

@Service
public class FeedbackServiceImp {
    @Autowired
    private FeedbackRepository feedbackRepository;
    //create
    public Feedback saveFeedback(Feedback fb, int ideaId) {
        fb.setIdeaId(ideaId);
        return feedbackRepository.save(fb);
    
    }
    //get list of feedback related to one ideaId
    public List<Feedback> getAllFeedback(int ideaId) {

        return feedbackRepository.findByideaId(ideaId);
    }
    //delete feedback
    public void deletEmployeeById(int feedBackId) {
        feedbackRepository.deleteById(feedBackId);

    }




 

}