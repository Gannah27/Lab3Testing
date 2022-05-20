package com.company;


public class Money {
    int c=0;
    void empty(int c){
        c =0;
    }
    void addMoney(){
        c++;
    }
    boolean checkMoney(){
        if(c>0)
            return true;
        else
            return false;
    }
}