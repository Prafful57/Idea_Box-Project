import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { Idea } from 'src/model/model';


@Injectable({
  providedIn: 'root'
})
export class HttpclientService {

  constructor(private httpClient: HttpClient) { }
  getIdeas(){
    return this.httpClient.get<Idea[]>('http://localhost:8082/idea/search');
  }
  
  likeInc(id: number, body:null){
    return this.httpClient.put("http://localhost:8082/idea/"+"likes/"+id, null);
    }
  getviewIdea(id: number, body:null){
    return this.httpClient.get<Idea[]>('http://localhost:8082/idea/view')
  }
}
