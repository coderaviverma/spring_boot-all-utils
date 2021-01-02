package com.example.demo.java.designPattern.structural.adapter;

//This is the client class.
public class AdapterPatternDemo {
    public static void main(String args[]) {
        CreditCard targetInterface = new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());
    }
}//End of the BankCustomer class.  