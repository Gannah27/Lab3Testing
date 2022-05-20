package com.company;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class coffeeTest {
    coffee x;
    Found k;
    Money c;
    String s;
    @BeforeEach
    public void init() {
        x = new coffee();
        k = new Found();
        c = new Money();
    }
    class coinInsert{
        int insert(int x){
            if(x>0)
                return x;
            else
                return 0;
        }
    }
    @Test
    public void coffeeStub(){
        coinInsert y = new coinInsert();
        x.despence(y.insert(5));
        assertEquals(x.k.found,5);
    }
    class doubleCoffee{
        String check(int x){
            if(x%2==0)
                return "you can make double coffees";
            else
                return "you can't make double coffees";
        }
    }
    @Test
    public void stockDriver(){
        doubleCoffee y = new doubleCoffee();
        s = y.check(k.available());
        assertEquals(s,"you can make double coffees");
        k.take();
        s = y.check(k.available());
        assertEquals(s,"you can't make double coffees");
    }
    @AfterEach
    public void clean(){
        x=null ;
    }
}