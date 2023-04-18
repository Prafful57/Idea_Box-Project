import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import { Feedback } from './feedback/feedback';


@Injectable({
  providedIn: 'root'
})
export class FeedbacksService {
  private url:string="http://localhost:8084/feedback";
  // fb = new Feedback();

  constructor(private http:HttpClient) { }

  createFeedback(feedback:Object ):Observable<Object>{
   var idId  =sessionStorage.getItem("ideaId");
    return this.http.post(`${"http://localhost:8084/feedback/"}${idId}`,feedback)
  }

  deleteFeedback(feedBackId:number):Observable<Feedback>{
    return this.http.delete<Feedback>(this.url+"/"+feedBackId);
  }
}
