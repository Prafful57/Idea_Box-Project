import { Component, OnInit } from '@angular/core';
import { Ideabox} from '../ideabox';
import { IdeaboxService } from '../ideabox.service';

@Component({
selector: 'app-ideabox',
templateUrl: './ideabox.component.html',
styleUrls: ['./ideabox.component.css']
})

export class IdeaboxComponent implements OnInit {
idea:Ideabox=new Ideabox()
constructor(private iservice:IdeaboxService){
}
addsave(){
  this.iservice.createIdea(this.idea).subscribe()
}
onSubmit(){
  this.addsave()
  window.location.reload();
  alert("Successfully Submitted")
}
ngOnInit(): void {
}
}

  