import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../model/user';

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {

  constructor(private http:HttpClient) { }
  public loginUserFromRemote(user:User):Observable<any>{
   return this.http.post("http://localhost:5001/login",user)
  }
  public registerUserFromRemote(user:User):Observable<any>{
    return this.http.post("http://localhost:5001/registeruser",user)
   }
   public adminLoginFromRemote(user:User):Observable<any>{
    return this.http.post("http://localhost:5002/adminLogin",user)
   }
}