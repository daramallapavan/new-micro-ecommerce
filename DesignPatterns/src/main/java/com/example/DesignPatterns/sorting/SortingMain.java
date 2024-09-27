package com.example.DesignPatterns.sorting;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class SortingMain {

    public static void main(String[] args) {

        Student student1=new Student(106,"satya");
        Student student2=new Student(101,"krishna");
        Student student3=new Student(108,"surya");
        Student student4=new Student(102,"hema");
        Student student5=new Student(112,"kavya");

        Map<Integer,Student> map=new ConcurrentHashMap<>();

        map.put( 4,student1);
        map.put( 1,student2);
        map.put( 3,student3);
        map.put( 2,student4);

     Iterator<Map.Entry<Integer,Student>> iterator=  map.entrySet().iterator();

     while (iterator.hasNext()){
       Map.Entry<Integer,Student> entry=  iterator.next();
         System.out.println(entry);

         map.put( 5,student5 );
     }

    }
}
