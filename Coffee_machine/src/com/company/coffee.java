package com.company;
import java.util.Scanner;
public class coffee {
    Money c = new Money();
    Found k = new Found();
    public void coffee(){
    }
    public void coffee(int s){
        k.refill(s);
    }
    void despence(int x){
        while(x>0 && k.checkStock()){
            System.out.println("coffee");
            c.addMoney();
            k.take();
            x--;
        }
        if (x!=0)
            System.out.println("machine empty");
    }
    void status(){
        System.out.println("there are "+k.checkStock()+" coffees in\n there are "+ c.checkMoney()+ "coins \n");
    }
    public static void main(String args[]){
    }
}