package com.example.scott.musicexchange;

import com.example.scott.musicexchange.Interfaces.Sellable;

/**
 * Created by scott on 29/10/2017.
 */

public abstract class Instrument {
    String name;
    String brand;
    String type;
    double buyPrice;
    double sellPrice;

    public Instrument(String name, String brand, String type, double buyPrice, double sellPrice) {
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getName(){
        return this.name;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getType(){
        return this.type;
    }
    public double getBuyPrice(){
        return this.buyPrice;
    }
    public double getSellPrice(){
        return this.sellPrice;
    }
    public double calculateMarkup(){
        return this.sellPrice - this.buyPrice;
    }

}
