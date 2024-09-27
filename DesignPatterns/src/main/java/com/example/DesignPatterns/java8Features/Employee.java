package com.example.DesignPatterns.java8Features;

import java.util.Objects;

public class Employee {


    private String name;

    private String department;

    private double salary;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Double.compare( employee.salary, salary ) == 0 && Objects.equals( name, employee.name ) && Objects.equals( department, employee.department );
    }

    @Override
    public int hashCode() {
        return Objects.hash( name, department, salary );
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public double getSalary(){
        return salary;
    }
    public void setDepartment(String department){
        this.department=department;
    }

    public String getDepartment(){
        return department;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public Employee(String name,String department,double salary){
        this.name=name;
        this.department=department;
        this.salary=salary;
    }



}
