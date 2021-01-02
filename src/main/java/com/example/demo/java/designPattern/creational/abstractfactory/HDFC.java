package com.example.demo.java.designPattern.creational.abstractfactory;

class HDFC implements Bank{
         private final String BNAME;  
         public HDFC(){  
                BNAME="HDFC BANK";  
        }  
        public String getBankName() {  
                  return BNAME;  
        }  
}  