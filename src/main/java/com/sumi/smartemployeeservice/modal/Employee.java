package com.sumi.smartemployeeservice.modal;

public class Employee {
    private int id;
    private String name;
    private String address;
    public Employee(){

    }
    public Employee(int id, String name, String address) {
        super();
        this.id=id;
        this.address=address;
        this.name=name;
            }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
