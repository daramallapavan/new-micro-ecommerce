package com.example.DesignPatterns.july25;

import com.example.DesignPatterns.abstraction.A;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Programs {

    public static void main(String[] args) {


        int[] array={1,0,2,1,8,7,0,2,1,2,0};

        sortedArray( array, array.length );

        System.out.println(Arrays.toString( array ));

    }

    private static void sortedArray(int [] array,int n){

        int low=0;
        int mid=0;
        int high=n-1;

        int i=0;
        while (mid<=high){
            if (array[mid]==0){
                int temp=array[mid];
                array[mid]=array[low];
                array[low]=temp;
                low++;
                mid++;
            }else if (array[mid]==1){
               mid++;
            }else {
                int temp=array[mid];
                array[mid]=array[high];
                array[high]=temp;
                high=high-1;

            }
        }



    }



}
