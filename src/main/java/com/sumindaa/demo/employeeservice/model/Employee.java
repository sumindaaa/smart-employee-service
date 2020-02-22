package com.sumindaa.demo.employeeservice.model;

import java.util.Date;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private Date dob;
    private String gender;


    public Employee() {


    }
    public Employee(String firstName, String lastName, String gender) {
        super();

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   // public Date getDob() {
      //  return dob;
    //}

    //public void setDob(Date dob) {
     //   this.dob = dob;
    //}

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
