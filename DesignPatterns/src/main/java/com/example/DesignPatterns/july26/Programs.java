package com.example.DesignPatterns.july26;


import java.util.*;

public class Programs {
    public static void main(String[] args) {


        String[] array={"One","Two","Three","Four","Five"};

        for (String str:array){
            System.out.print(str+" ");
        }

        System.out.println();

        List list= Arrays.asList(array);

       Iterator iterator= list.iterator();

       while (iterator.hasNext()){
           System.out.print(iterator.next()+" ");
       }



    }








}
