package com.example.DesignPatterns.java8Features;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        String string = "Java Developer";

       char value= firstRepeatedCharacter( string );
        System.out.println(value);


    }

    public static char firstRepeatedCharacter(String str) {


        return str.toLowerCase().replace( " ", "" ).chars().mapToObj( c -> (char) c )
                .collect( Collectors.groupingBy( c -> c, Collectors.counting() ) )
                .entrySet()
                .stream()
                .filter( entry -> entry.getValue() > 1 )
                .map( entry -> entry.getKey() )
                .findFirst()
                .get();
    }
}