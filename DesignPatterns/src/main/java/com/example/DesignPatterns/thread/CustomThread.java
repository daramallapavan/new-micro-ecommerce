package com.example.DesignPatterns.thread;

public class CustomThread  implements  Runnable{

    private int max;

    public CustomThread(EvenOddPrinter printer,int max, boolean isEvenNumber ) {
        this.max = max;
        this.isEvenNumber = isEvenNumber;
        this.printer = printer;
    }

    private boolean isEvenNumber;

    EvenOddPrinter printer;

    @Override
    public void run() {

       int number= isEvenNumber?2:1;

       while (number<= max){
           if (isEvenNumber){
               printer.printEven( number );
           }else{
               printer.printOdd( number );
           }
           number+=2;
       }
    }
}
