import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { MIdea } from './myPost';


@Injectable({
  providedIn: 'root'
})
export class MyPostsService {
  private url: string ="http://localhost:"

  constructor(private http:HttpClient) { }

ideaId = new MIdea();

  getIdea=(empId:any)=>{
    //get the seesion data and pass and parameter
    var getid=sessionStorage.getItem("empId");
    return this.http.get<any>(`${this.url+"8082/idea/searchEmp/"}${getid}`)
  }
  getFeedback=(ideaId:number)=>{
      return this.http.get<any>(`${this.url+"8084/feedback/"}${ideaId}`)
  }

  getSuggestion=(ideaId:number)=>{
    return this.http.get<any>(`${this.url+"8083/suggestion/"}${ideaId}`)
  }

  //  getLikes=(ideaId:number)=>{
  //  return this.http.get<any>(`${this.url+"8082/idea/searchLikesIdeaId/"}${ideaId}`)
  //  }
  
}
