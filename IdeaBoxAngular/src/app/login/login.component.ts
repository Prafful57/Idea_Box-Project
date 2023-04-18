import { Component, OnInit } from '@angular/core';
import{NgForm} from '@angular/forms'
import { Route, Router } from '@angular/router';
import { RegistrationService } from '../registration.service';
import { User } from '../../model/user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
 user = new  User();
 msg='';
  constructor(private service:RegistrationService, private router:Router) { }

  ngOnInit(): void {
  }
  // loginSucess(empId:any){
   
  //   this.router.navigate(['/myPost'])
  // }
  loginUser(empId:any){
    this.service.loginUserFromRemote(this.user).subscribe(
      data=>{
        console.log("response recieved");
        sessionStorage.setItem("empId",empId);
        this.router.navigate(['/home'])
      
      },
      error => alert("Invalid")
    );
  }
  
  goToRegistration(){
    this.router.navigate(['/registration'])
  }
}
