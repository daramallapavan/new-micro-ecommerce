package com.example.DesignPatterns.java8Features;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {


        List<Employee> employeeList = Arrays.asList( new Employee( "Pavan1", "IT", 20000 ),
                new Employee( "Pavan1", "ME", 22000 ),
                new Employee( "Pavan2", "CE", 29000 ),
                new Employee( "Pavan3", "ME", 15000 )
                , new Employee( "Pavan4", "CSE", 21000 ),
                new Employee( "Pavan5", "ECE", 20500 ),
                new Employee( "Pavan6", "EEE", 26000 ),
                new Employee( "Pavan7", "CE", 20700 ),
                new Employee( "Pavan8", "CSE", 20300 ),
                new Employee( "Pavan1", "ECE", 27000 ),
                new Employee( "Pavan1", "EEE", 200000 )

        );


        //average salary of CE department

        Double averageSalary = employeeList.stream()
                .filter( e -> e.getDepartment().equalsIgnoreCase( "CE" ) )
                .collect( Collectors.averagingDouble( Employee::getSalary ) );

        System.out.println(averageSalary);


    }

}
