import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import {  ReactiveFormsModule,FormsModule } from '@angular/forms';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { WelcomePageComponent } from './welcome-page/welcome-page.component';
import { HomeComponent } from './home/home.component';
import { SearchComponent } from './search/search.component';

import { AdminloginsuccessComponent } from './adminloginsuccess/adminloginsuccess.component';
import { IdeaboxComponent } from './ideabox/ideabox.component';
import { IdealistComponent } from './idealist/idealist.component';
import { ViewideaComponent } from './viewidea/viewidea.component';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { MyPostComponent } from './my-post/my-post.component';
import { DeletefeedbackComponent } from './deletefeedback/deletefeedback.component';

import { GivefeedbackComponent } from './givefeedback/givefeedback.component';
import { GivesuggestionComponent } from './givesuggestion/givesuggestion.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegistrationComponent,
    AdminloginComponent,
    WelcomePageComponent,
    HomeComponent,
    SearchComponent,
    AdminloginsuccessComponent,
    IdeaboxComponent,
    IdealistComponent,
    ViewideaComponent,
    MyPostComponent,
    DeletefeedbackComponent,
    GivefeedbackComponent,
    GivesuggestionComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule,
    Ng2SearchPipeModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
