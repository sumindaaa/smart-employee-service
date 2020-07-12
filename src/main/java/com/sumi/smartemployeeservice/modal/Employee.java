package com.sumi.smartemployeeservice.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    //@GeneratedValue
    private Integer id;
    private String name;
    private String address;

    public Employee() {

    }

    public Employee(Integer id, String name, String address) {
        super();
        this.id = id;
        this.address = address;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
