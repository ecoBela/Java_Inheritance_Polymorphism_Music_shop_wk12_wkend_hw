package items;

public class Instrument extends Item{
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
}
