package com.example.DesignPatterns.strings;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        int[] array={7,4,8,3,4,5,2,1,9,6,9};



       int number= secondLargestNumber( array );
        System.out.println(number);
    }



    public static int secondLargestNumber(int[] array){
        int largest=0;
        int secondLargest=0;


        for (int i=0;i<array.length;i++){
            if (array[i]>largest){
                secondLargest=largest;
                largest=array[i];
            }else if(array[i]< secondLargest && array[i]>largest){
                secondLargest=array[i];
            }
        }

        return secondLargest;
    }
}
