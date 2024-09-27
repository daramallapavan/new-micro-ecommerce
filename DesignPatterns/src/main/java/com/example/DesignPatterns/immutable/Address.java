package com.example.DesignPatterns.immutable;

public class Address {


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    private String city;


    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }

    public Address(String city, String pincode) {
        this.city = city;
        this.pincode = pincode;
    }

    private String pincode;


}
