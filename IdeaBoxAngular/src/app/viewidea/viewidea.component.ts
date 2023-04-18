import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { IdeaserviceService } from '../ideaservice.service';
import { FormControl, FormGroup, FormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-viewidea',
  templateUrl: './viewidea.component.html',
  styleUrls: ['./viewidea.component.css']
})
export class ViewideaComponent implements OnInit {

  id!: number;
  idea!: any;
  uform!:FormGroup;

  constructor(
    private tServ:IdeaserviceService, 
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];//here we are getting the id from the [roterlink-parameter(idea id)] here we are saving the parameter id to get the data of the specified idea id not all only specified
        
    this.tServ.find(this.id).subscribe((data)=>{//finding the entry and storing that idea id in data//idea is a variable here
      this.idea = data;

    });

      this.uform = new FormGroup({//this form is for updating the data and this is required when posting the dataalso put data //we are storing all the form values in this.form variable 
        ideaId: new FormControl('', [Validators.required]),
        ideaTitle: new FormControl('', Validators.required),
        ideaDescription: new FormControl('', Validators.required),
        tags: new FormControl('', Validators.required),
        submittedDate: new FormControl('', Validators.required),
        empId: new FormControl('', Validators.required),
        likes: new FormControl('', Validators.required),
        ideaStatus: new FormControl('', Validators.required)

      });
      
  }

  get f(){
    return this.uform.controls;
  }

  onsubmit(uform:any){
    console.log(this.uform.value);
    debugger;
    this.tServ.update(this.id, uform).subscribe((res:any) => {
      console.log(res);
         alert('idea approved!');
        //  this.router.navigateByUrl('idea/index');
        this.router.navigate(['login'])
    })
  }

  deleteIdea(id:number){
    if(confirm("Are you sure want to reject this idea")){
    TODO:this.tServ.delete(id).subscribe(res => {
         this.idea = this.idea.filter((item: { id: number; }) => item.id !== id);
         console.log('Idea deleted successfully!');
         this.router.navigateByUrl('idea/index');
    })
  }
  }
}
