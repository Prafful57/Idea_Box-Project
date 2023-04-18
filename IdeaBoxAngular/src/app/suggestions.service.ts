// import { Injectable } from '@angular/core';

// @Injectable({
//   providedIn: 'root'
// })
// export class SuggestionsService 

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import { Suggestion } from './suggestion/suggestion';

@Injectable({
  providedIn: 'root'
})
export class SuggestionService {
  private url:string="http://localhost:8083/suggestion";

  constructor(private http:HttpClient) { }
  createSuggestion(suggestion:Object):Observable<Object>{
    var idId  =sessionStorage.getItem("ideaId");
    return this.http.post(`${"http://localhost:8083/suggestion/"}${idId}`,suggestion)
  }


  deleteSuggestion(suggestionId:number):Observable<Suggestion>{
    return this.http.delete<Suggestion>(this.url+"/"+suggestionId)
  }
}


