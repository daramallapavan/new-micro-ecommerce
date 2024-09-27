package com.example.DesignPatterns.immutable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public  final class Employee implements Cloneable {

    private  final String name;

    private final  String password;

    private  final List<String>  phoneNumbers;

    private final  Date dateOfBirth;

    private Address address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Employee(String name, String password, List<String> phoneNumbers, Date dateOfBirth, Address address){
        this.name=name;
        this.password=password;
        this.phoneNumbers=phoneNumbers;
        this.dateOfBirth=dateOfBirth;
        this.address=address;
    }

    public Address getAddress(){
        return new Address( address.getCity(),address.getPincode() );
    }

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }
    public List<String> getPhoneNumbers(){
        return new ArrayList<>(phoneNumbers);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", dateOfBirth=" + dateOfBirth +
                ",address="+address+
                '}';
    }

    public Date getDateOfBirth() throws CloneNotSupportedException {
        return (Date) dateOfBirth.clone();
    }



}
