package com.sumindaa.demo.employeeservice.model;

import java.util.Date;

public class Employee {
    private int id;
    private char firstName;
    private char lastName;
    private Date dob;
    private char gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getFirstName() {
        return firstName;
    }

    public void setFirstName(char firstName) {
        this.firstName = firstName;
    }

    public char getLastName() {
        return lastName;
    }

    public void setLastName(char lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
