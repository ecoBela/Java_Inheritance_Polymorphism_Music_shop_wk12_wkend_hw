package items;

import behaviours.IPlay;

public class Instrument extends Item implements IPlay {
    private String colour;
    private String material;

    public Instrument(String itemName, double buyingPrice, double sellingPrice, String colour, String material){
        super(itemName, buyingPrice, sellingPrice);
        this.colour = colour;
        this.material = material;

    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public String play(String data) {
        return data;
    }
}
