package com.example.DesignPatterns.july06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Programs {

    public static void main(String[] args) {

        int[] array={1,2,3,4,1,2,6,2};

        removeDuplicates( array );
    }

    private static void removeDuplicates(int[] array){

        List<Integer> list=new ArrayList<>();
        for (int i:array){
            list.add( i );
        }


     List<Integer> result=   list.stream().filter( n-> Collections.frequency(list,n)==1 ).collect( Collectors.toList());


        System.out.println(result);
    }
}
