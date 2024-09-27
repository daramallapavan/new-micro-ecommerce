package com.example.DesignPatterns.arraylistimpl;

import java.util.ArrayList;

public class ArrayListImpl extends ArrayList {

    @Override
    public boolean add(Object o) {
        if (this.contains( o )){
            return true;
        }else{
            return super.add( o );
        }
    }

    public static void main(String[] args) {

        ArrayListImpl arrayList=new ArrayListImpl();

        arrayList.add( 1 );
        arrayList.add( 1 );
        System.out.println(arrayList);
    }
}
