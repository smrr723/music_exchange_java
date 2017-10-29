package com.example.scott.musicexchange.Instruments;

import com.example.scott.musicexchange.Instrument;
import com.example.scott.musicexchange.Interfaces.Playable;
import com.example.scott.musicexchange.Interfaces.Sellable;

/**
 * Created by scott on 29/10/2017.
 */

public class Violin extends Instrument implements Sellable, Playable {

    int strings;

    public Violin(String name, String brand, String type, double buyPrice, double sellPrice, int strings) {
        super(name, brand, type, buyPrice, sellPrice);
        this.strings = strings;
    }

    public String play(){
        return "Nnnnn";
    }
    public int getStrings(){
        return this.strings;
    }
    }
