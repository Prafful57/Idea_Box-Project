import { Component, OnInit } from '@angular/core';
import { FeedbacksService } from '../feedbacks.service';

@Component({
  selector: 'app-deletefeedback',
  templateUrl: './deletefeedback.component.html',
  styleUrls: ['./deletefeedback.component.css']
})
export class DeletefeedbackComponent implements OnInit {

  public feed!:number;

  constructor( private del:FeedbacksService) { }

  ngOnInit(): void {
  }
  //Method that is called from the frontend when user deletes the button
  onSubmit(feedbackId:number){
    this.del.deleteFeedback(feedbackId).subscribe(data => console.log(data) );
  }
}
