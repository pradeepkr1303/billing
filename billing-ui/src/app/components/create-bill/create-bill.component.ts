import { Component, OnInit, TemplateRef } from '@angular/core';
import { BillService } from './../../service/bill.service'
import { Customer } from 'src/app/entity/customer';
import { Item } from 'src/app/entity/item';
import { BsDropdownConfig } from 'ngx-bootstrap/dropdown';
import { BsModalService, BsModalRef } from 'ngx-bootstrap/modal'
import { CustomerServiceService } from 'src/app/service/customer-service.service';
import { TypeaheadMatch } from 'ngx-bootstrap/typeahead/typeahead-match.class';

@Component({
  selector: 'app-create-bill',
  templateUrl: './create-bill.component.html',
  styleUrls: ['./create-bill.component.css'],
  providers: [{ provide: BsDropdownConfig, useValue: { isAnimated: true, autoClose: true } }]
})
export class CreateBillComponent implements OnInit {

  //Variable for using number-to-words package
  converter: any = require("number-to-words");

  billNo: Text;
  customer: Customer;
  date: Date = new Date();

  isItemsEmpty: boolean = true;
  items: Item[] = [
    // {
    //   sNo: 1,
    //   particular: "Royal blue twill tape 10mm",
    //   hsnCode: "998821",
    //   quantity: 10,
    //   qUnit: "Kilogram",
    //   rate: 178,
    //   total: 1780
    // },
    // {
    //   sNo: 2,
    //   particular: "Grey melange twill tape 10mm",
    //   hsnCode: "998821",
    //   quantity: 10,
    //   qUnit: "Kilogram",
    //   rate: 178,
    //   total: 1780
    // },
    // {
    //   sNo: 3,
    //   particular: "Royal blue twill tape 10mm",
    //   hsnCode: "998821",
    //   quantity: 10,
    //   qUnit: "Kilogram",
    //   rate: 178,
    //   total: 1780
    // }
  ];
  temp: Item;
  showAddItemButton: boolean = true;

  sNo: number = 0;
  particular: String;
  hsnCode: String;
  quantity: number;
  qUnit: String;
  rate: number;
  total: number;

  taxableAmount: number = 0;
  cgst: number = 0;
  sgst: number = 0;
  roundOff: number = 0;
  grandTotal: number = 0;
  amountInWords: String;

  modalRef: BsModalRef;

  customers: any;

  constructor(private billService: BillService, private customerService: CustomerServiceService, private modalService: BsModalService) { }

  addItem() {
    if (this.particular && this.hsnCode && this.quantity && this.qUnit && this.rate) {
      this.sNo += 1; 
      this.total = +(this.quantity * this.rate).toFixed(2);
      this.temp = new Item(this.sNo, this.particular, this.hsnCode, this.quantity, this.qUnit, this.rate, this.total);
      this.items.push(this.temp);
      this.isItemsEmpty = false;
      this.calculateTotal();
      this.particular = this.hsnCode = this.quantity = this.qUnit = this.rate = null;
      this.modalRef.hide();
    }
    if (this.sNo == 3) {
      this.showAddItemButton = false;
    }
  }

  calculateTotal() {
    this.taxableAmount += this.total;
    this.cgst = +(this.taxableAmount * 2.5 / 100).toFixed(2);
    this.sgst = +(this.taxableAmount * 2.5 / 100).toFixed(2);
    this.roundOff = +(Math.round(this.total + this.cgst + this.sgst) - (this.total + this.cgst + this.sgst)).toFixed(2);
    this.grandTotal = Math.round(this.taxableAmount + this.cgst + this.sgst + this.roundOff);
    this.amountInWords = this.converter.toWords(this.grandTotal).concat(' rupees only');
  }

  openNewItemModal(newItem: TemplateRef<any>) {
    this.modalRef = this.modalService.show(newItem);
  }

  onSelect(event: TypeaheadMatch): void {
    this.customer = event.item;
  }

  ngOnInit() {
    this.billService.getBillCount().subscribe((data:any) => {
      this.billNo = data.data;
    });
    this.customerService.getAllCustomers().subscribe((data:any) => {
      this.customers = data.data;
    });
  }

}
