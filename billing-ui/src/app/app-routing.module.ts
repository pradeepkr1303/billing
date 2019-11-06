import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NewBillComponent } from './new-bill/new-bill.component';
import { AddClientComponent } from './add-client/add-client.component';


const routes: Routes = [
  {path: "new-bill", component: NewBillComponent},
  {path: "add-client", component:AddClientComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
