package com.example.DesignPatterns.solidprinciples.dip;

public class ShoppingMall {

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard){
        this.bankCard=bankCard;
    }

    public void pay(){
        System.out.println("done ");
        System.out.println();


    }

}
