import { Component, OnInit } from '@angular/core';

import { FormBuilder } from '@angular/forms';
import { HttpclientService} from '../service/httpclient.service';
import { Router } from '@angular/router';
import { Idea } from 'src/model/model';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  public isReadLess:boolean = false;
  text:string=''; 
  viewidea!: Idea[];
  ideas!: Idea[];	
  searchText: string='';
  order: any;
  constructor(private httpClientService: HttpclientService,private formBuilder: FormBuilder,private router:Router) { }

  //automatically show the ideas when page loads
  ngOnInit(): void {
    this.httpClientService.getIdeas().subscribe(
      response => this.handleSuccessfulResponse(response),
    );
  }
  handleSuccessfulResponse(response: any) {
    this.ideas = response;
    }
    getAllData() {
      this.httpClientService.getIdeas().subscribe(res => {
        this.ideas = res;
      })
    }

    // viewIdea(data:number){
    //   this.httpClientService.getviewIdea(data, null).subscribe(res=>{
    //     this.viewidea=res;
    //   })
    // }
    onLikeClick(data: number){
      this.httpClientService.likeInc(data, null).subscribe(res=>{
      alert("Thanks for the Like");
      // // this.router.navigateByUrl('',{skipLocationChange:true}).then(()=>{
      // //   this.router.navigate(['']);
      // });
      window.location.reload();
      },
      err => {
              alert("Sorry.. There was some problem Try again")
            })
       
      }
  
      onSearchTextEntered(searchValue: string){
        this.searchText=searchValue;
        console.log(this.searchText);
      }
      sortData(){
        if(this.order){
          let newarr = this.ideas.sort((a,b)=>a.likes-b.likes)
          this.ideas = newarr;
        }
        else{
          let newarr = this.ideas.sort((a,b)=>b.likes-a.likes)
          this.ideas = newarr;
        }
        this.order = !this.order;
      }
      
    postIdea(){
      this.router.navigate(['/ideabox'])
    }
    myPost(){
      this.router.navigate(['/my-post'])
    }
  createFeedback(ideaId:any){
     sessionStorage.setItem("ideaId",ideaId);
      this.router.navigate(['/givefeedback'])
    }
    createSuggestion(ideaId:any){
      sessionStorage.setItem("ideaId",ideaId);
      this.router.navigate(['/givesuggestion'])
    }
}
