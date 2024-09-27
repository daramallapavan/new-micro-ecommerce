package com.example.DesignPatterns.interthread;

public class Communication {

    public static void main(String[] args) {


        Thread t1=new Thread(()->{

           EvenOrOdd.printEvenNumbers();
        });

        Thread t2=new Thread(()->{
          EvenOrOdd.printOddNumbers();
        });
        t1.start();

        t2.start();
    }
}
