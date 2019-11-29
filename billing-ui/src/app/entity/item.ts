export class Item {
    sNo: number = 0;
    particular: String;
    hsnCode: String;
    quantity: number;
    qUnit: String;
    rate: number;
    total: number;

    constructor(sNo: number, particular: String, hsnCode: String, quantity: number, qUnit: String, rate: number, total: number) {
        this.sNo = sNo;
        this.particular = particular;
        this.hsnCode = hsnCode;
        this.quantity = quantity;
        this.qUnit = qUnit;
        this.rate = rate;
        this.total = total;
    }

}
