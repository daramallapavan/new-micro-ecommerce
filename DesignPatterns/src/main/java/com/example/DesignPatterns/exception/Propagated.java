package com.example.DesignPatterns.exception;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Propagated {

    public static void main(String[] args) {

      Integer [] array={4, 5, 8, 7, 4,4,4,4,4,4,4, 7, 6,7,6,6,6};

//MostFrequentElementProgram

        //4,6,7

      List<Integer> list= Arrays.asList( array );

        Integer integer = list.stream()
                .collect( Collectors.groupingBy( Function.identity(), Collectors.counting() ) )
                .entrySet()
                .stream()
                .max( Map.Entry.comparingByValue() )
                .map( x -> x.getKey() )
                .get();

        System.out.println(integer);

    }
}
