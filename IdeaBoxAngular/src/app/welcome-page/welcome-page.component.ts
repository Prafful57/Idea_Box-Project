import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RegistrationService } from '../registration.service';
import { User } from '../../model/user';

@Component({
  selector: 'app-welcome-page',
  templateUrl: './welcome-page.component.html',
  styleUrls: ['./welcome-page.component.css']
})
export class WelcomePageComponent implements OnInit {

  user = new  User();
  msg='';
   constructor(private service:RegistrationService, private router:Router) { }

  ngOnInit(): void {
  }
  UserLogin(){
   this.router.navigate(['/login'])
  }

  AdminLogin(){
    this.router.navigate(['/adminLogin'])
   }
 

}
