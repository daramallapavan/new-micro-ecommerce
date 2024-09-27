package com.example.DesignPatterns.thread;


import com.example.DesignPatterns.abstraction.C;

public class MainThread {
    public static void main(String[] args)  {

        EvenOddPrinter evenOddPrinter=new EvenOddPrinter();

        Thread t1=new Thread(new CustomThread( evenOddPrinter,10,true ),"Odd");



        Thread t2=new Thread(new CustomThread( evenOddPrinter,10,true ),"Even");
        t1.start();


        t2.start();
    }
}
