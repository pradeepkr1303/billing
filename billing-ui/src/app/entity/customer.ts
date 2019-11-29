export class Customer {
    name: String;
    address: String;
    gstin: String;
    phoneNumber: String;

    constructor(name: String, address: String, gstin: String, phoneNumber: String) {
        this.name = name;
        this.address = address;
        this.gstin = gstin;
        this.phoneNumber = phoneNumber;
    }
}
