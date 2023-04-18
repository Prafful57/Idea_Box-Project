
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import{Ideabox} from './ideabox';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class IdeaboxService{
  private url:string="http://localhost:8082/idea"

  constructor(private http:HttpClient) {
  
   }
   getIdea():Observable<Ideabox[]> {
    return this.http.get<Ideabox[]>(this.url);
  }
  
createIdea(Idea:Object):Observable<Object>{
return this.http.post(this.url,Idea)
}

// deleteIdea(ideaId:any):Observable<any> {
//   return this.http.delete(this.url+'/ideaId')
// }
}