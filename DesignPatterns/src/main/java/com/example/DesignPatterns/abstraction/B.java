package com.example.DesignPatterns.abstraction;

import com.fasterxml.jackson.core.JsonPointer;

public  abstract class B {


    private int id;

    private String name;

    public B(int id,String name){

        this.id=id;
        this.name=name;

        System.out.println("abstract class  constructor is called");
    }



    public void show(){
        System.out.println("show method called from abstract class"+ id+" "+name);
    }

    public  static void dance(){
        System.out.println("dance static method called from abstract class");
    }

    public  static  void sing(){
        System.out.println("final  sing method called from abstract class");
    }

    public abstract void print();



}
