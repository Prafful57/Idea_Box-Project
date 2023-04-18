import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { RegistrationService } from '../registration.service';
import { User } from '../../model/user';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
user = new User();
msg='';
  constructor(private service:RegistrationService, private router:Router,private formBuilder: FormBuilder) { }

  ngOnInit(): void {
  }

  emp = this.formBuilder.group({
		empId: ['', [Validators.required,Validators.pattern("^[0-9]{4,6}$")]],
		emailId: ['', [Validators.required, Validators.email]],
		password: ['', [Validators.required,  Validators.pattern("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&].{8,}$")]],
		name: ['', [Validators.required]],
		role: ['', Validators.required],
    dept: ['', Validators.required],
    phone: ['', [Validators.required, Validators.pattern("^((\\+91-?)|0)?[0-9]{10}$")]]
    
	});

	validateAllFormFields(formGroup: FormGroup) {
		Object.keys(formGroup.controls).forEach((field) => {
			const control = formGroup.get(field);
			if (control instanceof FormControl) {
				control.markAsTouched({ onlySelf: true });
			} else if (control instanceof FormGroup) {
				this.validateAllFormFields(control);
			}
		});
	}
  get f(){  
    return this.emp.controls;  
  } 
  submit(){  
    console.log(this.emp.value);  
  } 
  
  registerUser(){
    this.service.registerUserFromRemote(this.user).subscribe(
        data=>{
     alert("Registered Successfully")
      this.msg="Registration successful";
      this.router.navigate(['/login'])
        },
        error=>{
      alert("Existing Details")
      this.msg=error.error;
  })

}
GoToLoginPage(){
  this.router.navigate(['login'])
}
}
