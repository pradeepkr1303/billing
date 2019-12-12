import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreateBillComponent } from './components/create-bill/create-bill.component';
import { CreateCustomerComponent } from './components/create-customer/create-customer.component'
import { HomeComponent } from './components/home/home.component';
import { ContactUsComponent } from './components/contact-us/contact-us.component';
import { AboutUsComponent } from './components/about-us/about-us.component';


const routes: Routes = [
  {path:"", redirectTo:"home", pathMatch:"full"},
  {path:"home", component:HomeComponent},
  {path: "newBill", component: CreateBillComponent},
  {path: "createCustomer", component:CreateCustomerComponent},
  {path: "contact-us", component: ContactUsComponent},
  {path: "about-us", component: AboutUsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
