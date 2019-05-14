package com.example.demo.hibernates;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="employee_name",length=60)
    private String employeeName;

    @NaturalId
    @Column(name="user_name",length=60,nullable=false)
    private String username;

    @Column(name="password",nullable=false)
    private String password;

    @Column(name="accress_level")
    private int accessLevel;


    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
