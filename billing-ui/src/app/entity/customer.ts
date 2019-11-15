export class Customer {
    name: Text;
    address: Text;
    gstin: Text;
    phoneNumber: Text;

    constructor(name: Text, address: Text, gstin: Text, phoneNumber: Text) {
        this.name = name;
        this.address = address;
        this.gstin = gstin;
        this.phoneNumber = phoneNumber;
    }
}
