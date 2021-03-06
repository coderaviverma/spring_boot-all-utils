package com.example.demo.hibernates.inheritance.defaultinheritance;

import org.hibernate.annotations.NaturalId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="employee_table")
public class Employee extends Person{


    @NaturalId
    @Column(name="salary",columnDefinition="DECIMAL(7,2)")
    private Double  salary;

    @Column(name="password",nullable=false)
    private String password;

    @Column(name="accress_level")
    private int accessLevel;


}
