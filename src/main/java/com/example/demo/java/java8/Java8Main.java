package com.example.demo.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Main {

    public static void main(String[] args) {


        List<Employee> list=new ArrayList<>();
        list.add(new Employee("shashi",2345,"java"));
        list.add(new Employee("avi",5555,"java"));
        list.add(new Employee("tanvi",3333,"php"));
        list.add(new Employee("ankit",2345,"html"));
        list.add(new Employee("rohit",2,"dataentry"));

        List<Employee> employeeList=list.stream().filter(e -> e.getDept().equalsIgnoreCase("java") && e.getSalary()<3000)
                .collect(Collectors.toList());




        for (Employee e :
                employeeList) {
            System.out.println(e);

        }

    }
}
