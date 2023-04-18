import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdminloginsuccessComponent } from './adminloginsuccess/adminloginsuccess.component';
import { DeletefeedbackComponent } from './deletefeedback/deletefeedback.component';

import { GivefeedbackComponent } from './givefeedback/givefeedback.component';
import { GivesuggestionComponent } from './givesuggestion/givesuggestion.component';
import { HomeComponent } from './home/home.component';
import { IdeaboxComponent } from './ideabox/ideabox.component';
import { IdealistComponent } from './idealist/idealist.component';
import { LoginComponent } from './login/login.component';
import { MyPostComponent } from './my-post/my-post.component';
import { RegistrationComponent } from './registration/registration.component';
import { ViewideaComponent } from './viewidea/viewidea.component';
import { WelcomePageComponent } from './welcome-page/welcome-page.component';


const routes: Routes = [
  
  {path:'',component:WelcomePageComponent},
  {path:'registration', component:RegistrationComponent},
  {path:'login',component:LoginComponent},
  {path:'adminLogin',component:AdminloginComponent},
  {path:'adminloginsuccess',component:AdminloginsuccessComponent},
  {path:'home',component:HomeComponent},
  {path:'ideabox',component:IdeaboxComponent},
  {path:'idealist',component:IdealistComponent},
  {path:'viewidea',component:ViewideaComponent},
  { path: '', redirectTo: 'idea/index', pathMatch: 'full'},
  { path: 'idea/index', component: IdealistComponent },
  { path: 'idea/:id/view', component: ViewideaComponent },
  { path: 'my-post', component: MyPostComponent },
  { path: 'deleteFeedback', component: DeletefeedbackComponent },
  { path: 'givefeedback', component: GivefeedbackComponent},
  { path: 'givesuggestion', component: GivesuggestionComponent},
  { path: 'my-post\route.html', component: MyPostComponent }, 
  { path: 'welcome', component: WelcomePageComponent}
  // { path: 'D:\casestudyang\src\app\my-post\route.html'


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
