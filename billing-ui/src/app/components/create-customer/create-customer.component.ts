import { Component, OnInit } from '@angular/core';
import { Customer } from '../../entity/customer';
import { CustomerServiceService } from '../../service/customer-service.service'

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {

  //Customer details
  customerName: string;
  customerAddress: string;
  gstin: string;
  phoneNumber: string;
  
  //Success Message text
  message: Text;

  //For Subscribing data
  userDetails: any;

  constructor(private customerService: CustomerServiceService) { }

  //Save customer method
  saveCustomer() {
    let customer: Customer = {
      name: this.customerName,
      address: this.customerAddress,
      gstin: this.gstin,
      phoneNumber: this.phoneNumber
    }
    
    this.customerService.saveCustomer(customer).subscribe((data: {}) => {
      this.userDetails = data;
      this.message = this.userDetails.responseMessage;
    });
  }

  ngOnInit() {
  }

}
