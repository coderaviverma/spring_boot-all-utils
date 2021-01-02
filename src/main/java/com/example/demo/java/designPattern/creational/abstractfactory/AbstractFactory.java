package com.example.demo.java.designPattern.creational.abstractfactory;

abstract class AbstractFactory{
  public abstract Bank getBank(String bank);  
  public abstract Loan getLoan(String loan);  
}  