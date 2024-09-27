package com.example.DesignPatterns.june28;

public class Employee {

    private int id;

    private String name;

    private double salary;

    private String department;

    public void setDepartment(String department){
        this.department=department;
    }

    public String getDepartment(){
        return department;
    }


    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;

    }


    public Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
}
