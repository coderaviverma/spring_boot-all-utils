package com.example.demo.hibernates.inheritance.defaultinheritance;

import org.hibernate.annotations.NaturalId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="employee_table")
public class Student extends Person{


    @NaturalId
    @Column(name="fees")
    private Double  fees;

    @Column(name="password")
    private String password;

    @Column(name="accress_level")
    private int accessLevel;


}
