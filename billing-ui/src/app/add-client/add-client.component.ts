import { Component, OnInit } from '@angular/core';
import { Customer } from '../entity/customer';
import { CustomerServiceService } from '../service/customer-service.service';

@Component({
  selector: 'app-add-client',
  templateUrl: './add-client.component.html',
  styleUrls: ['./add-client.component.css']
})
export class AddClientComponent implements OnInit {

  clientName: Text;
  clientAddress: Text;
  gstin: Text;
  phoneNumber: Text;
  message: Text;

  userDetails: any;

  constructor(public customerService: CustomerServiceService) { }

  saveCustomer() {
    let customer: Customer = {
      'name': this.clientName,
      'address': this.clientAddress,
      'gstin': this.gstin,
      'phoneNumber': this.phoneNumber
    }
    
    this.customerService.saveCustomer(customer).subscribe((data: {}) => {
      this.userDetails = data;
      this.message = this.userDetails.responseMessage;
    });
  }

  ngOnInit() {
  }

}
