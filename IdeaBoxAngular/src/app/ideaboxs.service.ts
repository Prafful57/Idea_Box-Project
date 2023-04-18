import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'

})
export class IdeaboxsService {
  private url: string ="http://localhost:"
  constructor(private http:HttpClient) { }

  getIdea=(empId:number)=>{
    return this.http.get<any>(`${this.url+"8082/idea/"}${empId}`)
  }
  getFeedback=(ideaId:number)=>{
    return this.http.get<any>(`${this.url+"8084/feedback/"}${ideaId}`)
  }
  getSuggestion=(ideaId:number)=>{
    return this.http.get<any>(`${this.url+"8083/suggestion/"}${ideaId}`)
  }
   getLikes=(ideaId:number)=>{
   return this.http.get<any>(`${this.url+"8082/idea/searchLikesIdeaId/"}${ideaId}`)

   }
}
