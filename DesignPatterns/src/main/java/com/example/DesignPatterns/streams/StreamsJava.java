package com.example.DesignPatterns.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsJava {

    public static void main(String[] args) {

         List<Integer> list=Arrays.asList( 1,2,3,4,5 );

        List<String> collect = list.stream().map( String::valueOf ).collect( Collectors.toList() );

     //   System.out.println(collect);
     //   list.forEach( s-> System.out.println(s) );//Consumer

        Set<Integer> set=null;
        list.stream();
        //flatMap -> Function
        //map-> Function
        //forEach-> Consumer
        //filter -> Predicate


    }
}
