import { Component, OnInit } from '@angular/core';
import { Suggestion } from '../suggestion/suggestion';
import { SuggestionService } from '../suggestions.service';
@Component({
  selector: 'app-givesuggestion',
  templateUrl: './givesuggestion.component.html',
  styleUrls: ['./givesuggestion.component.css']
})
export class GivesuggestionComponent implements OnInit {

  suggestion = new Suggestion();
  constructor(private sservice:SuggestionService) { }

  ngOnInit(): void {
  }
    addSave(){
      this.sservice.createSuggestion(this.suggestion).subscribe(data=>console.log(data));
      this.suggestion=new Suggestion();
    }
    onSubmit(){
      this.addSave();
      alert("Thanks For Your Suggestion")
    }

}


