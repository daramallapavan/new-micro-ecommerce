package com.example.DesignPatterns.june25;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


class Example{
    static int x=10;
    int y=20;
}
public class June25Main {

    public static void main(String[] args) {

Example e1=new Example();
Example e2=new Example();
e1.x=30;
e1.y=40;

        System.out.println(e1.x+" "+e1.y);
        System.out.println(e2.x+" "+e2.y);
    }






}
