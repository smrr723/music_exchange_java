package com.example.scott.musicexchange;

import com.example.scott.musicexchange.Instruments.Triangle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by scott on 30/10/2017.
 */

public class TriangleTest {

    Triangle triangle;

    @Before
    public void before(){
        triangle = new Triangle("T27", "Master", "T2", 250, 290, "Titanium");

    }


    @Test
    public void canCalcMarkup(){
        assertEquals(40, triangle.calculateMarkup(), 0.01);
    }
}
