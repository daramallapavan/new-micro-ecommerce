package com.example.DesignPatterns.defaultmethods;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        Map<String,Employee> map=new HashMap<>();
        map.put( "P1" ,new Employee("P1","HR",25000));
        map.put( "P2" ,new Employee("P2","Java",21000));
        map.put( "P3" ,new Employee("P3","React",23000));
        Employee put = map.put( "P4", new Employee( "P4", "Angular", 20000 ) );

        method( map );


    }

    public static void method(Map<String,Employee> map){
        List<Employee> collect = map.entrySet().stream().map( entry -> entry.getValue() )
                .filter( e->e.getSalary()>22000 )
                .collect( Collectors.toList() );

        System.out.println(collect);
    }
}
