package com.example.EmployeeManagerCLI.model;

public class Employee {
    private String id;
    private String name;
    private String role;
    private double hourlyPay;

    public Employee(){

    }

    public Employee(String id, String name, String role, double hourly_pay){
        this.id = id;
        this.name = name;
        this.role = role;
        this. hourlyPay = hourlyPay;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public double getHourlyPay() { return hourlyPay; }
    public void setHourlyPay(Double hourlyPay) { this.hourlyPay = hourlyPay;}
}
