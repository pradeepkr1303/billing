import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreateBillComponent } from './components/create-bill/create-bill.component';
import { CreateCustomerComponent } from './components/create-customer/create-customer.component'
import { HomeComponent } from './components/home/home.component';


const routes: Routes = [
  {path:"", redirectTo:"home", pathMatch:"full"},
  {path:"home", component:HomeComponent},
  {path: "newBill", component: CreateBillComponent},
  {path: "createCustomer", component:CreateCustomerComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
