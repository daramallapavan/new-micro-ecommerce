package com.example.DesignPatterns.exception;

import java.io.*;

public class WhatsApp {

    public  static void inCatch(){
        System.out.println("Inside Catch Block another method");
    }

    public void audiCall(int age ) throws DesignException {


        try{
            if (age<18){
                throw  new  DesignException( "not eligible for vote" );
            }  else{
                System.out.println("eligible for vote");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }





    }
}
