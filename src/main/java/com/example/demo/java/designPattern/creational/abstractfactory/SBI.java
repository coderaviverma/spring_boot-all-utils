package com.example.demo.java.designPattern.creational.abstractfactory;

class SBI implements Bank{
      private final String BNAME;  
      public SBI(){  
                BNAME="SBI BANK";  
        }  
       public String getBankName(){  
                  return BNAME;  
       }  
}  