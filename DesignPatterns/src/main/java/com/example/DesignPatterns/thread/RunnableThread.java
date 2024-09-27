package com.example.DesignPatterns.thread;

public class RunnableThread {

    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{
            for (int i=1;i<=10;i++){
                try {
                    Thread.sleep( 10 );
                } catch (InterruptedException e) {
                    throw new RuntimeException( e );
                }
                if (i%2==0){
                    System.out.print(i+" ");
                }
            }
        });

        t1.start();
        t1.join();



        System.out.println();
        Thread t2=new Thread(()->{
            for (int i=1;i<=10;i++){
                if (i%2!=0){
                    System.out.print(i+" ");
                }
            }
        });
        t2.start();
    }
}
