package com.example.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Company {

    @Id
    @GeneratedValue
    private int id;
    private String companyName;
    private String employeesNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(String employeesNumber) {
        this.employeesNumber = employeesNumber;
    }
}
