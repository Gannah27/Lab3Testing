package com.company;

public class Found {
    int found=10;
    void refill(int k){
        found +=k;
    }
    void take(){
        found -=1;
    }
    void empty(){
        found =0;
    }
    int available(){
        return found;
    }
    boolean checkStock(){
        if(found>0)
            return true;
        else
            return false;
    }
}