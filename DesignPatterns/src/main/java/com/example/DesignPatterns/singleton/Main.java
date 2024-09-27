package com.example.DesignPatterns.singleton;

public class Main {

    public static void main(String[] args) {



        new Thread(()->{
            Singleton instance = Singleton.getInstance();
            System.out.println(Thread.currentThread().getName()+" "+instance.hashCode());
        }).start();
        new Thread(()->{
            Singleton instance = Singleton.getInstance();
            System.out.println(Thread.currentThread().getName()+" "+instance.hashCode());
        }).start();
        new Thread(()->{
            Singleton instance = Singleton.getInstance();
            System.out.println(Thread.currentThread().getName()+" "+instance.hashCode());
        }).start();



    }
}
