import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MyPostsService } from '../my-posts.service';

@Component({
  selector: 'app-my-post',
  templateUrl: './my-post.component.html',
  styleUrls: ['./my-post.component.css']
})
export class MyPostComponent implements OnInit {

  ideaId!: number
  feedback: any
  suggestion : any
  Idea!: any
  ide!:any
  empId !: number
  constructor(private idea:MyPostsService, private router:Router) { }

  ngOnInit(): void {
  }
  getIdea(){
    this.idea.getIdea(this.empId).subscribe(ide=>this.Idea=ide)
 }
 getFeedback(ideaId:any){
    this.idea.getFeedback(ideaId).subscribe(data =>this.feedback=data)
 }
 getSuggestion(ideaId:any){
  this.idea.getSuggestion(ideaId).subscribe(data =>this.suggestion=data)
 }

}
