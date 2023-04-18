import { Component, OnInit } from '@angular/core';
import { Feedback } from '../feedback/feedback';
import { FeedbacksService } from '../feedbacks.service';

@Component({
  selector: 'app-givefeedback',
  templateUrl: './givefeedback.component.html',
  styleUrls: ['./givefeedback.component.css']
})
export class GivefeedbackComponent implements OnInit {

  feedback = new Feedback();
  constructor(private fservice:FeedbacksService) { }

  ngOnInit(): void {
  }
    addSave(){
      this.fservice.createFeedback(this.feedback).subscribe(data=>console.log(data));
      this.feedback=new Feedback();
    }
    onSubmit(){
      this.addSave();
      alert("Thanks For Your Feedback")
    }
}
