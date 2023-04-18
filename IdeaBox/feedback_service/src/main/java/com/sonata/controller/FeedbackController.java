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

 


import com.sonata.model.Feedback;

import com.sonata.service.implementation.FeedbackServiceImp;

 

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/feedback")
public class FeedbackController {
   
    @Autowired
    private FeedbackServiceImp feedbackServiceImpl;

    //create feedback
    @PostMapping("/{ideaId}")
    public ResponseEntity<Feedback>createEmployee(@RequestBody Feedback feedback,@PathVariable int ideaId){
        Feedback fb1=feedbackServiceImpl.saveFeedback(feedback,ideaId);
        return ResponseEntity.status(HttpStatus.CREATED).body(fb1);

    }

    //get employee by ideaId from db
    @GetMapping("/{ideaId}")
    public List<Feedback> getFeedbacks(@PathVariable int ideaId) {
            return feedbackServiceImpl.getAllFeedback(ideaId);
    }

   
    //delete feedback
    @DeleteMapping("/{feedBackId}")
    public void deleteEmployee(@PathVariable int feedBackId) {
        feedbackServiceImpl.deletEmployeeById(feedBackId);
    }

 

}