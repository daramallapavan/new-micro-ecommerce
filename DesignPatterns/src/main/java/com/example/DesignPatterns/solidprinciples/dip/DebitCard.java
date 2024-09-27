package com.example.DesignPatterns.solidprinciples.dip;

public class DebitCard implements BankCard{
    @Override
    public void payMoney() {

        System.out.println("DebitCard");
    }
}
