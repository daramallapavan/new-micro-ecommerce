package com.example.DesignPatterns.immutable;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Collectors;

public class ImmutableEmployee {
    public static void main(String[] args) throws CloneNotSupportedException {

        Address address=new Address( "kmm","56477" );
        Employee employee=new Employee( "Pavan","1234",
                Arrays.stream( new String[]{"1234","4567"} ).collect( Collectors.toList()),
                new Date() ,address);


        employee.getAddress().setCity( "hyd" );



       System.out.println(employee);

        System.out.println("clone");

        Employee emp=(Employee)employee.clone();
        System.out.println(emp);

    }
}
