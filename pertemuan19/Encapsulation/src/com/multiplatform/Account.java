package com.multiplatform;

public class Account {
   /* public String accountNumber;
    //public  String name;
    public  String firstName;
    public double balance;*/

    private String accountnumber;
    private String firstname;
    private double balance;

    public Account(String accountnumber, String firstname, double balance) {
        this.accountnumber = accountnumber;
        this.firstname = firstname;
        this.balance = Math.min(balance,100);
    }

    public void withdrawl(double amount) {
        if (balance - amount < 0) {
            System.out.println("Not enough balance");
        }else{
            balance -= amount;
            System.out.println("Withdrawl completed");
        }
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}