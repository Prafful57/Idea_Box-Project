import { Component, OnInit } from '@angular/core';
import { IdeaserviceService } from '../ideaservice.service';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-idealist',
  templateUrl: './idealist.component.html',
  styleUrls: ['./idealist.component.css']
})
export class IdealistComponent implements OnInit {

  public ideaList:any=[];
  filterTerm!: string;

  constructor(private iServ:IdeaserviceService,  private router:Router) { }

  //for getting the list,this is the method which is accessed first when the page is loaded
  ngOnInit(): void {
    this.iServ.getIdeaList().subscribe(idea=>this.ideaList=idea);//to display on web browser we need to store in ideaList variable//=> is the lamda expression for getting all data from database//idea is the variable//and diplay this data in ngForm
  }

}
