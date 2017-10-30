package com.example.scott.musicexchange;

import com.example.scott.musicexchange.Instruments.Violin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by scott on 30/10/2017.
 */

public class ViolinTest {
    Violin violin;

    @Before
    public void before(){
        violin = new Violin("T27", "Master", "T2", 250, 290, 6);

    }
    @Test
    public void canGetBrand(){
        assertEquals("Master", violin.getBrand());
    }

    @Test
    public void canCalcMarkup(){
        assertEquals(40, violin.calculateMarkup(), 0.01);
    }
}
