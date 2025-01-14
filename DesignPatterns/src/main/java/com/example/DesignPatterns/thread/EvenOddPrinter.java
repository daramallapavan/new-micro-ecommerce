package com.example.DesignPatterns.thread;

public class EvenOddPrinter {


    private volatile boolean isOdd;

    public  synchronized  void printEven(int number){

        while (!isOdd){
            try{
                wait();
            } catch (InterruptedException e) {
               Thread.currentThread().interrupt();
            }
        }

        System.out.println(Thread.currentThread().getName()+" "+number);
        isOdd=false;
        notify();
    }


    public  synchronized  void printOdd(int number){

        while (isOdd){
            try{
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println(Thread.currentThread().getName()+" "+number);
        isOdd=true;
        notify();
    }
}
