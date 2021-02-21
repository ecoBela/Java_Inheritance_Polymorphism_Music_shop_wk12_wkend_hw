package items;

public class Guitar extends Instrument{
    private int noOfStrings;

    public Guitar(String itemName, double buyingPrice, double sellingPrice, String colour, String material, int noOfStrings){
        super(itemName, buyingPrice, sellingPrice, colour, material);
        this.noOfStrings = noOfStrings;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }
}
