import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

import {Customer} from './../entity/customer'

@Injectable({
  providedIn: 'root'
})
export class CustomerServiceService {

  // Base url
  baseurl = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  // Http Headers
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }

  saveCustomer(data): Observable<Customer> {
    return this.http.post<Customer>(this.baseurl + '/backend' + '/customer' + '/saveCustomer', JSON.stringify(data), this.httpOptions);
  }

  getAllCustomers(): Observable<Customer> {
    return this.http.get<Customer>(this.baseurl + '/backend' + '/customer' + '/allCustomers');
  }
}
