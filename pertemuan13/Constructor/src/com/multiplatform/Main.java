package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        Account bobsAccount = new Account("11111111", 200.0, "John", "john@mail.com", "081211111");
//	bobsAccount.setNumber("123456789");
//	bobsAccount.setBalance(100.00);
//	bobsAccount.setCustomerName("Bob");
//	bobsAccount.setEmailAddress("bob@mail.com");
//	bobsAccount.setPhoneNumber("(62)0811324234");

        System.out.println("Customer name : " +bobsAccount.getCustomerName());
        System.out.println("Balance : " +bobsAccount.getBalance());
        System.out.println("Email : " +bobsAccount.getEmailAddress());
        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(155.0);
    }
}
