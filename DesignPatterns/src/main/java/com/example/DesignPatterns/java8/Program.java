package com.example.DesignPatterns.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program {


    public static void main(String[] args) {


    List<Integer> list=Arrays.asList( 1,2,3,4,5,6,7,8,9,10 );

        Map<Boolean, List<Integer>> collect = list.stream().collect( Collectors.partitioningBy( n -> n % 2 == 0 ) );

        System.out.println(collect);
    }
}
