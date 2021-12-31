package com.tosan.example3;

public class Deposit {
    private int balance;
    public void defray(int balance){
        this.balance += balance;
    }
    public void withdrawal(int balance) throws Exception{
        if(this.balance < balance){
            throw new Exception();
        }
        this.balance -= balance;
    }
}
