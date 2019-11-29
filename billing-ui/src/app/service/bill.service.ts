import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BillService {

  // Base url
  baseurl = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  // Http Headers
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }

  getBillCount() {
    return this.http.get(this.baseurl + "/backend" + "/bill" + "/getBillCount");
  }

}
