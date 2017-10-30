package com.example.scott.musicexchange;

import com.example.scott.musicexchange.Instruments.Piano;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by scott on 30/10/2017.
 */

public class PianoTest {
    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Harper 255", "Deluxe", "Grand", 25000, 29000, "Synthetic Ivory");
    }
    @Test
    public void canGetName(){
        assertEquals("Harper 255", piano.getName());
    }
    @Test
    public void canCalcMarkup(){
        assertEquals(4000, piano.calculateMarkup(), 0.01);
    }
}
