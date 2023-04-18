import { Component, OnInit } from '@angular/core';
import { IdeaboxsService } from '../ideaboxs.service';
import { LLikes } from '../Likes';

@Component({
  selector: 'app-ideaboxc',
  templateUrl: './ideaboxc.component.html',
  styleUrls: ['./ideaboxc.component.css']
})
export class IdeaboxcComponent implements OnInit {

  ideaId!: number
  feedback: any
  suggestion : any
  likes !:any
  Idea!: any
  empId !: number
  ideaId2 !: number
  ideaId1 !: number
  constructor(private idea:IdeaboxsService) { }
  ngOnInit(): void{

  }
  onClick(){

     this.idea.getFeedback(this.ideaId).subscribe(data =>this.feedback=data)
     this.idea.getSuggestion(this.ideaId1).subscribe(data =>this.suggestion=data)
     this.idea.getLikes(this.ideaId2).subscribe(data =>this.likes=data)
     this.idea.getIdea(this.empId).subscribe(ide=>this.Idea=ide)
  }
}


