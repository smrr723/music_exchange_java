package com.example.scott.musicexchange;

import com.example.scott.musicexchange.Instruments.Cello;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by scott on 30/10/2017.
 */

public class CelloTest {
    Cello cello;

    @Before
    public void before() {
        cello = new Cello("Winchester 1000", "Five Span", "String", 5000.0, 6000.0, 7);
    }

    @Test
    public void canPlay(){
        assertEquals("Mmmmmm", cello.play());
    }

    @Test
    public void canGetName(){
        assertEquals("Winchester 1000", cello.getName());
    }
    @Test
    public void canGetBrand(){
        assertEquals("Five Span", cello.getBrand());
    }

    @Test
    public void canCalcMarkup(){
        assertEquals(1000, cello.calculateMarkup(), 0.01);
    }
}





//public class DragonTest {
//
//    Dragon dragon;
//
//    @Before
//    public void before(){
//        dragon = new Dragon("Bob");
//    }
//
//    @Test
//    public void hasName(){
//        assertEquals("Bob", dragon.getName());
//    }
//
//    @Test
//    public void canFly(){
//        assertEquals(dragon.fly(),"Standing up tall, beating wings, lift off!");
//    }
//}