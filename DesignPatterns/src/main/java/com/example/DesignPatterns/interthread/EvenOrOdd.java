package com.example.DesignPatterns.interthread;

public class EvenOrOdd {


    public  static    void   printEvenNumbers()  {
        for (int i=1;i<=10;i++){

                if (i%2==0){
                    System.out.print(i+" ");
                }


        }

        System.out.println("Even numbers are completed");

    }

    public  static    void printOddNumbers(){
        for (int i=1;i<=10;i++){

                if (i%2!=0){
                    System.out.print(i+" ");
                }


        }
        System.out.println("odd numbers are completed");
    }


}
