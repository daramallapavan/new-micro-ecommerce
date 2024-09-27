package com.example.DesignPatterns.solidprinciples.dip;

public class Main {

    public static void main(String[] args) {

        BankCard bankCard=new CreditCard();
        ShoppingMall shoppingMall=new ShoppingMall(  bankCard);

        shoppingMall.pay();
    }
}
