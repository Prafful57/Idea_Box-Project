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


import com.sonata.model.Idea;

import com.sonata.repository.IdeaRepository;
import com.sonata.service.implementation.IdeaServiceImp;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/idea")
public class IdeaController {
	@Autowired
	private IdeaServiceImp ideaServiceImp;
	@Autowired
	private IdeaRepository ideaRepository;
	//Create idea request to upload
	@PostMapping
	public ResponseEntity<Idea>createIdea(@RequestBody Idea idea){
		Idea idea1=ideaServiceImp.saveIdea(idea);
		return ResponseEntity.status(HttpStatus.CREATED).body(idea1);
		
	}
	@GetMapping("/allidea")
    public List<Idea>getAllIdeas(){
        return ideaServiceImp.findAllIdeas();
    }
	
	//get ideas of employee by empid admin
	@GetMapping("/{empId}")
	public List<Idea> getIdea(@PathVariable int empId){
		return ideaServiceImp.getIdeaById(empId);
	}
	
	   //get ideas of employee by empid admin
	@GetMapping("idealist/{ideaId}")
    public List<Idea> getIdeaByIdeaId(@PathVariable int ideaId){

        return ideaServiceImp.getIdeaByIdeaId(ideaId);
    }
	
	//get ideas of employee by empid employee
	
	@GetMapping("/searchEmp/{empId}")
	public List<Idea> getIdeaEmp(@PathVariable int empId){
		return ideaServiceImp.getIdeaByEmpId(empId);
	}
	
	//get list of ideas from database by like
	@GetMapping("/searchLikes/{likes}")
	public List<Idea> getIdeaByLike(@PathVariable int likes){
		List<Idea> ideaList=ideaServiceImp.getByLike(likes);
		return ideaList;
	}
	
	//get list of ideas from database by like
		@GetMapping("/searchLikesIdeaId/{ideaId}")
		public Idea getIdeaLikeByIdeaId(@PathVariable int ideaId){
			
			return ideaServiceImp.getByLikeIdeaId(ideaId);
		}
	
	
	//get list of ideas matching with tags
	@GetMapping("/searchTagAdmin/{tags}")
	public List<Idea> getIdeaByTags(@PathVariable String tags){
		List<Idea> ideaTagList=ideaServiceImp.getByTags(tags);
		return ideaTagList;
	}
	
	//get list of ideas matching with tags
	@GetMapping("/searchTagUser/{tags}")
	public List<Idea> getIdeaByTagsUser(@PathVariable String tags){
		List<Idea> ideaTagList=ideaServiceImp.getByTagsUser(tags);
		return ideaTagList;
	}
		
	
	//get list of ideas matching with status approved for users
	@GetMapping("/search")
	public List<Idea> getIdeaByIdeaStatus(){
		List<Idea> ideaAppList=ideaServiceImp.getByStatus();
		return ideaAppList;
	}
	
	//get list of ideas matching with status submitted for admin
		@GetMapping("/search/admin")
		public List<Idea> getIdeaByIdeaSubmitted(){
			List<Idea> ideaSubList=ideaServiceImp.displayIdeaSubmitted();
			return ideaSubList;
		}
	
	//get list of ideas according to date
	@GetMapping("/searchDate/{submittedDate}")
	public List<Idea> getIdeaByDates(@PathVariable String submittedDate){
		List<Idea> ideaDateList=ideaServiceImp.getBysubmittedDate(submittedDate);
		return ideaDateList;
	}
	
	
	//delete idea by ideaId
	@DeleteMapping("/{ideaId}")
	public void deleteIdea(@PathVariable int ideaId) {
		ideaServiceImp.deletIdeaById(ideaId);
	}
	
	//update the idea
	@PutMapping("/{ideaId}")
	public ResponseEntity update(@PathVariable int ideaId,@Validated @RequestBody Idea id) {
			
			 Idea i1  =ideaRepository.findById(ideaId).get();
			 
			 i1.setIdeaDescription(id.getIdeaDescription());
			 i1.setIdeaTitle(id.getIdeaTitle());
			 Idea update= ideaRepository.save(i1);
			 return ResponseEntity.ok(update);
			 
			
	}
	
	//status update
	@PutMapping("/status/{ideaId}")
	public ResponseEntity statusUpdate(@PathVariable int ideaId,@Validated @RequestBody Idea id) {
		     Idea i1  =ideaRepository.findById(ideaId).get();
			 i1.setIdeaStatus("Approved");
			 Idea statusUpdate= ideaRepository.save(i1);
			 return ResponseEntity.ok(statusUpdate);
			 
			
	}
	
	//like update
	@PutMapping("/likes/{ideaId}")
	 //we are getting only one parameter so we are using @pathvariable
    public Idea increment(@PathVariable int ideaId) {
//         return ideaServiceImp.likeInc(ideaId);
        Idea idea = ideaRepository.findById(ideaId).get();
        idea.setLikes((idea.getLikes()+1));
        return ideaRepository.save(idea);   
			
	}

}
