package com.multiplatform;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    //Constructor
    public Account(){
        this("99999999",0.0,"Default Name", "Default Email" , "0811111111");
    }

    public Account(String number, double balance, String customerName, String emailAddress, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public void deposit (double amount){
        this.balance += amount;
        System.out.println("Deposit of " + amount + " made. New balnce is " + this.balance);
    }

    public void withdrawal (double amount){
        if(this.balance < 0){
            System.out.println("Insufficient funds. Withdrawal not processes");
        }else {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " processed, Remaining balance is " + this.balance);
        }
    }

//    public void setNumber(String number) {
//        this.number = number;
//    }

    public double getBalance() {
        return balance;
    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public String getCustomerName() {
        return customerName;
    }

//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }

    public String getEmailAddress() {
        return emailAddress;
    }

//    public void setEmailAddress(String emailAddress) {
//        this.emailAddress = emailAddress;
//    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
}
