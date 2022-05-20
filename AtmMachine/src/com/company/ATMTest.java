package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ATMTest {
    ATM x;
    deposit d;
    withdraw w;
    String s;
    @BeforeEach
    public void init() {
        x = new ATM();
        d = new deposit();
        w = new withdraw();
    }
    class money{
        int insert(int x){
            if(x>0)
                return x;
            else
                return 0;
        }
    }
    @Test
    public void ATMstub(){
        money y = new money();
        x.operate(2,y.insert(5000));
        assertEquals(x.money,5000);
    }
    @Test
    public void withdrawStub(){
        money y = new money();
        double z =w.get_money(2000,y.insert(5000));
        assertEquals(z,3000);
    }
    @Test
    public void depositStub(){
        money y = new money();
        double z =d.deposit(2000,y.insert(5000));
        assertEquals(z,7000);
    }
    @AfterEach
    public void clean(){
        x=null ;
    }
}