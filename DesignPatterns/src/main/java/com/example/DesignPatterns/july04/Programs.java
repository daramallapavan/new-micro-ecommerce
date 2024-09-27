package com.example.DesignPatterns.july04;


import com.example.DesignPatterns.abstraction.B;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Programs {

    public static void main(String[] args) {


        int[] array={1,2,3,4,5,6,7,8,9};

      int n=  mostFrequentElement( array );

        System.out.println(n);
    }

    private static int mostFrequentElement(int[] array){

     return    Arrays.stream( array )
                .boxed()
                .collect( Collectors.groupingBy( Function.identity(),Collectors.counting() ) )
                .entrySet()
                .stream()
                .max( Map.Entry.comparingByValue() )
                .map( entry->entry.getKey() )
                .stream().findFirst().get();
    }





}
