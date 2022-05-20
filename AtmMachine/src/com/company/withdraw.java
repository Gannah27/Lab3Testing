package com.company;

public class withdraw {
    double get_money(double withdraw, double balance){
        if(balance >= withdraw)
            return balance - withdraw;
        else
            return balance;
    }
}