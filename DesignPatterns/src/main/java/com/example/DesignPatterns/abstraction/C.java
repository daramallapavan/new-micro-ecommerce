package com.example.DesignPatterns.abstraction;

public class C  extends B{


    public C(){
        super(11,"M");

        System.out.println("c class  constructors is called");
    }
    @Override
    public void print() {
        System.out.println("print method is called c class");
    }



}
