package com.example.DesignPatterns.solidprinciples.dip;

public class CreditCard  implements BankCard{
    @Override
    public void payMoney() {

        System.out.println("CreditCard");
    }
}
