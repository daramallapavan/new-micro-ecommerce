package com.example.DesignPatterns.cloudtech;

import java.util.Objects;

public class Customer {

    private int id;

    public Customer() {
    }

    private String name;

    public Customer(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;
        return id == customer.id && Double.compare( customer.salary, salary ) == 0 && Objects.equals( name, customer.name );
    }

    @Override
    public int hashCode() {
        return Objects.hash( id, name, salary );
    }
}
