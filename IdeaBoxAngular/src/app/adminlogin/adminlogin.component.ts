import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RegistrationService } from '../registration.service';
import { User } from '../../model/user';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {
  user = new User();
 msg='';

  constructor(private service:RegistrationService, private router:Router) { }

  ngOnInit(): void {
  }
  adminLogin(){
    this.service.adminLoginFromRemote(this.user).subscribe(
      data=>{
        console.log("response recieved");
        this.router.navigate(['/idealist'])

      },
      error => alert("Invalid")
    );
  }

}
