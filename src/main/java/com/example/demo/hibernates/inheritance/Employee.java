package com.example.demo.hibernates.inheritance;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Entity
@Table(name="employee_table")
public class Employee {


    @NaturalId
    @Column(name="user_name",length=60,nullable=false)
    private String username;

    @Column(name="password",nullable=false)
    private String password;

    @Column(name="accress_level")
    private int accessLevel;

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
