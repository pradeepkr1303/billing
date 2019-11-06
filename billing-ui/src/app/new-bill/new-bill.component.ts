import { Component, OnInit, TemplateRef } from '@angular/core';
import { OrderItem } from './../order-item';
import { BsModalService, BsModalRef } from 'ngx-bootstrap/modal'


@Component({
  selector: 'app-new-bill',
  templateUrl: './new-bill.component.html',
  styleUrls: ['./new-bill.component.css']
})
export class NewBillComponent implements OnInit {

  //Variable for using number-to-words package
  // converter: any = require("number-to-words");

  billNo: number;
  date: Date;
  to: Text;
  gstin: Text;
  taxableAmount: number = 0;
  sgst: number = 0;
  cgst: number = 0;
  roundOff: number = 0;
  grandTotal: number = 0;
  amountInWords: string;

  orderItems: OrderItem[] = [];
  // Temporary variables of class OrderItem
  sNo: number = 0;
  particulars: Text;
  hsnCode: Text;
  quantity: number;
  qUnit: Text;
  rate: number;
  total: number;

  temp: OrderItem;

  orderCount: number = 0;
  isOrderItemsEmpty: boolean = true;

  showAddButton: boolean = true;

  modalRef: BsModalRef;

  constructor(private modalService: BsModalService) {
  }

  addItem() {
    if (this.particulars && this.hsnCode && this.quantity && this.qUnit && this.rate) {
      this.sNo += 1; 
      this.total = +(this.quantity * this.rate).toFixed(2);
      this.temp = new OrderItem(this.sNo, this.particulars, this.hsnCode, this.quantity, this.qUnit, this.rate, this.total);
      this.orderItems.push(this.temp);
      this.orderCount = this.orderCount + 1;
      this.isOrderItemsEmpty = false;
      this.calculateTotal();
      this.particulars = this.hsnCode = this.quantity = this.qUnit = this.rate = null;
      this.modalRef.hide();
    }
    if (this.sNo == 4) {
      this.showAddButton = false;
    }
  }

  calculateTotal() {
    this.taxableAmount += this.total;
    this.cgst = +(this.taxableAmount * 2.5 / 100).toFixed(2);
    this.sgst = +(this.taxableAmount * 2.5 / 100).toFixed(2);
    this.roundOff = +(Math.round(this.total + this.cgst + this.sgst) - (this.total + this.cgst + this.sgst)).toFixed(2);
    this.grandTotal = this.taxableAmount + this.cgst + this.sgst + this.roundOff;
    // this.amountInWords = this.converter.toWords(this.grandTotal).concat(' rupees only');
    this.amountInWords = "rupees only";
  }

  open_new_item_modal(new_item: TemplateRef<any>) {
    this.modalRef = this.modalService.show(new_item);
  }

  ngOnInit() {
  }
}
