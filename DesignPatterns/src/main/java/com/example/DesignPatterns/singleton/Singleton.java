package com.example.DesignPatterns.singleton;

public class Singleton  {


    private Singleton(){

    }

    private static class Inner{

        private static final Singleton instance=new Singleton();
    }


    public static Singleton getInstance(){


        return Inner.instance;
    }

}
