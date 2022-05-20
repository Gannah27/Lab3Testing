package com.company;

public class ATM {
    double money = 0;
    withdraw w = new withdraw();
    deposit d = new deposit();
    public double operate(int x, double amount) {
        switch(x)
        {
            case 1:
                this.money =w.get_money(amount,money);
            case 2:
                this.money = d.deposit(amount,money);
        }return money;}
    public static void main(String args[] ) {
    }
}
