package com.sonata.service.implementation;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.sonata.model.Idea;
import com.sonata.repository.IdeaRepository;

@Service
public class IdeaServiceImp {
	@Autowired
	private IdeaRepository ideaRepository;
	
	    //create and upload idea for user
		public Idea saveIdea(Idea idea) {
			idea.setLikes(0);          //default the like value is set to zero for submitted idea
			idea.setIdeaStatus("Submitted");
			return ideaRepository.save(idea);
			
		}
		
		
		//delete idea by ideaId from db and also for reject
		public void deletIdeaById(int ideaId) {
			ideaRepository.deleteById(ideaId);
			
		}
		
		//get list of ideas from database by status(Idea should be posted in public forum after a review)
	
		public List<Idea> getByStatus() {
			return ideaRepository.findByIdeaStatus("Approved");
		}
		
		//get list of ideas matching with like ,display from large to small user
		public List<Idea> getByLike(int likes) {
			return ideaRepository.findAll().stream().filter(l->(l.getLikes()>=likes)&&l.getIdeaStatus().equals("Approved")).toList();
	     }
		
		
		
		//get list of ideas matching with tags user
		public List<Idea> getByTagsUser(String tags) {
					
			return ideaRepository.findByTags(tags).stream().filter(idea->(idea.getIdeaStatus().equals("Approved"))).toList();
		}
		
		// User should be able to search for ideas
		public List<Idea> getIdeaByEmpId(int empid) {
			return  ideaRepository.findAll().stream().filter(emp->((emp.getEmpId()==empid)&&emp.getIdeaStatus().equals("Approved"))).toList();
	     }
		
		//get likes for given ideaId
		public Idea getByLikeIdeaId(int ideaId) {
			// TODO Auto-generated method stub
			return ideaRepository.findById(ideaId).get();
		}
		public List<Idea> findAllIdeas() {
            // TODO Auto-generated method stub
            return ideaRepository.findAll(Sort.by(Sort.Direction.DESC,"id"));
        }
		//======================================================================
		
//		//get list of ideas matching with tags admin
//		public List<Idea> getByTags(String tags) {
//					
//			return ideaRepository.findByTags(tags).stream().filter(idea->(idea.getIdeaStatus().equals("Submitted"))).toList();
//		}
//		
//		//get ideas from db by empid for admin
//		public List<Idea> getIdeaById(int empid) {
//				return  ideaRepository.findAll().stream().filter(emp->((emp.getEmpId()==empid)&&emp.getIdeaStatus().equals("Submitted"))).toList();
//		}
//		
//		//get list of ideas according to date reverse chronological Order for admin
//		public List<Idea> getBysubmittedDate(String dates) {
//			return ideaRepository.findBySubmittedDate(dates);
//		}
//		
//		
//		//get list of ideas from database where the status is submitted(for admin)
//		public List<Idea> displayIdeaSubmitted() {
//			return ideaRepository.findByIdeaStatus("Submitted");
//		}
//		//get ideas from db by ideaid for admin
//        public List<Idea> getIdeaByIdeaId(int ideaId) {
//                return  ideaRepository.findAll().stream().filter(idea->((idea.getEmpId()==ideaId))).toList();
//        }
		//get list of ideas matching with tags admin
        public List<Idea> getByTags(String tags) {

            return ideaRepository.findByTags(tags).stream().filter(idea->(idea.getIdeaStatus().equals("Submitted"))).toList();
        }

        //get ideas from db by empid for admin
        public List<Idea> getIdeaById(int empid) {
                return  ideaRepository.findAll().stream().filter(emp->((emp.getEmpId()==empid)&&emp.getIdeaStatus().equals("Submitted"))).toList();
        }


        //get ideas from db by empid for admin.....
                public List<Idea> getIdeaByIdeaId(int ideaId) {
                        return  ideaRepository.findAll().stream().filter(idea->((idea.getIdeaId()==ideaId))).toList();
                }

        //get list of ideas according to date reverse chronological Order for admin
        public List<Idea> getBysubmittedDate(String dates) {
            return ideaRepository.findBySubmittedDate(dates); 
        }


        //get list of ideas from database where the status is submitted(for admin)
        public List<Idea> displayIdeaSubmitted() {
            return ideaRepository.findByIdeaStatus("Submitted");
        }

 


		


		

		

		
}
