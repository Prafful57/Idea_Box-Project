import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class IdeaserviceService {

  private url:string ="http://localhost:8082/idea";

  constructor(private http:HttpClient) { }

  getIdeaList():Observable<object>{
    return this.http.get<object>(this.url+"/search/admin");
  }

  //update
  find(id:number): Observable<any> {
    return this.http.get(this.url+"/idealist/"+id);
  }


  //observable is a method/writen type to do Http methods
  //any-to get only one entry/1 row--if collection of objects we need object as a written type
  update(id:number, idea:any): Observable<any> {
  
    return this.http.put(this.url+"/status/"+id,idea);
  }

  delete(id:number){
    return this.http.delete(this.url +'/'+ id);
  }
}
