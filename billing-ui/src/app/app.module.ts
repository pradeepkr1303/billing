import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ModalModule } from 'ngx-bootstrap/modal';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';
import { CreateCustomerComponent } from './components/create-customer/create-customer.component';
import { BsDatepickerModule } from 'ngx-bootstrap/datepicker';
import { CreateBillComponent } from './components/create-bill/create-bill.component';
import { BsDropdownModule } from 'ngx-bootstrap';
import { AccordionModule } from 'ngx-bootstrap';
import { TypeaheadModule } from 'ngx-bootstrap';
import { HomeComponent } from './components/home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    CreateCustomerComponent,
    CreateBillComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ModalModule.forRoot(),
    BrowserAnimationsModule,
    HttpClientModule,
    BsDatepickerModule.forRoot(),
    BsDropdownModule.forRoot(),
    AccordionModule.forRoot(),
    TypeaheadModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
