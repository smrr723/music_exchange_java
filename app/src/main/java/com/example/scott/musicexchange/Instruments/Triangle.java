package com.example.scott.musicexchange.Instruments;

import com.example.scott.musicexchange.Instrument;
import com.example.scott.musicexchange.Interfaces.Playable;
import com.example.scott.musicexchange.Interfaces.Sellable;

/**
 * Created by scott on 29/10/2017.
 */

public class Triangle extends Instrument implements Sellable, Playable {

    String material;

    public Triangle(String name, String brand, String type, double buyPrice, double sellPrice, String material) {
        super(name, brand, type, buyPrice, sellPrice);
        this.material = material;

    }


    public String play(){
        return "Ding.";
    }

    public String getMaterial(){
        return this.material;
    }
}
