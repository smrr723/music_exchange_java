package com.example.scott.musicexchange.Instruments;

import com.example.scott.musicexchange.Instrument;
import com.example.scott.musicexchange.Interfaces.Playable;
import com.example.scott.musicexchange.Interfaces.Sellable;

/**
 * Created by scott on 29/10/2017.
 */

public class Piano extends Instrument implements Sellable, Playable {

    String keyMaterial;

    public Piano(String name, String brand, String type, double buyPrice, double sellPrice, String keyMaterial) {
        super(name, brand, type, buyPrice, sellPrice);
        this.keyMaterial = keyMaterial;

    }

    public String play(){
        return "dun dun dun";
    }
    public String getKeyMaterial(){
        return this.getKeyMaterial();
    }
}
