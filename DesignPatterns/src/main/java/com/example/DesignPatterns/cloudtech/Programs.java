package com.example.DesignPatterns.cloudtech;


import com.example.DesignPatterns.java8Features.Employee;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programs {

    public static void main(String[] args) {



        List<Integer> list=new CopyOnWriteArrayList<>();
        list.add( 1 );
        list.add(2);

        for (int i:list){

            list.add( 3 );
        }

        System.out.println(list);



//        Set<Integer> set=new HashSet<>();
//
//        for (int i=1;i<500;i++){
//            set.add( i );
//        }
//
//
//        set.add( null );
//        set.add( null );
//
//        System.out.println(set);
//
//
//    List<Customer> customers=   Stream.of(
//                new Customer(101,"Employee1",29000  ),
//                new Customer(102,"Employee2",29000  ),
//                new Customer(103,"Employee3",27000  ),
//                new Customer(104,"Employee4",21000  ),
//                new Customer(105,"Employee5",25000  ),
//                new Customer(106,"Employee6",23000  ),
//                new Customer(107,"Employee7",20000  ),
//                new Customer(108,"Employee8",24000  )
//                ).collect( Collectors.toList());
//
//
//    }
//
//
//    private static Map.Entry<Double,List<String>> highestSalaryEmployee( int n,List<Customer> customerList) {
//
//        Map.Entry<Double, List<String>> doubleListEntry = customerList.stream()
//                .collect( Collectors.groupingBy( Customer::getSalary,
//                        Collectors.mapping( Customer::getName, Collectors.toList() ) ) )
//                .entrySet()
//                .stream()
//                .sorted( Collections.reverseOrder( Map.Entry.comparingByKey() ) )
//                .collect( Collectors.toList() ).get( n - 1 );
//
//        return doubleListEntry;
//
//
//    }


    }



}
