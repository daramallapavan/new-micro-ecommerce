package com.example.DesignPatterns.hashmapandconcurent;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CustomThread extends  Thread{

   private static  Map<Integer,String> map=new ConcurrentHashMap<>();

    @Override
    public void run() {

        try {
            Thread.sleep( 1000 );

            map.put( 5,"five" );

        } catch (InterruptedException e) {
            throw new RuntimeException( e );
        }

    }


    public static void main(String[] args) throws InterruptedException {


        map.put( 1,"one");
        map.put( 2,"two" );
        map.put( 3,"three" );
        map.put( 4,"four" );





        CustomThread customThread=new CustomThread();
        customThread.start();


        for (Map.Entry<Integer,String> entry:map.entrySet()){
          Integer keys=  entry.getKey();

          String values=entry.getValue();

            System.out.println(keys+" "+values);
            Thread.sleep( 1000 );
        }

        System.out.println(map);

    }
}
