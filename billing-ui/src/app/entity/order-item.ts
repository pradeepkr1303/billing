export class OrderItem {
    sNo: Number;
    particulars: Text;
    hsnCode: Text;
    quantity: Number;
    qUnit: Text;
    rate: Number;
    total: Number;

    constructor(sNo: Number, particulars: Text, hsnCode: Text, quantity: Number, qUnit: Text, rate: Number, total: Number) {
        this.sNo = sNo;
        this.particulars = particulars;
        this.hsnCode = hsnCode;
        this.quantity = quantity;
        this.qUnit = qUnit;
        this.rate = rate;
        this.total = total;
    }
}
