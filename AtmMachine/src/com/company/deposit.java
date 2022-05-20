package com.company;

public class deposit {
    double deposit(double deposit, double balance){
        if(deposit<=0)
            return balance;
        balance = balance + deposit;
        return balance;
    }
}
